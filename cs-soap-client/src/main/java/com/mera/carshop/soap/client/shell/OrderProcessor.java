package com.mera.carshop.soap.client.shell;

import com.mera.carshop.soap.service.ByCustomerIdAndStatusRequest;
import com.mera.carshop.soap.service.ByIdRequest;
import com.mera.carshop.soap.service.CreateOrderRequest;
import com.mera.carshop.soap.service.OrderResponse;
import com.mera.carshop.soap.service.OrderService;
import com.mera.carshop.soap.service.UpdateOrderRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.util.Assert;

import java.util.List;

@ShellComponent
public class OrderProcessor {

    private static final Logger logger = LogManager.getLogger(OrderProcessor.class);

    private OrderService orderService;

    @Autowired
    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    @ShellMethod("Get all orders")
    public List<OrderResponse> all() {
        List<OrderResponse> orders = orderService.getAllOrders();
        logger.info("retrieving a list of all orders, size: " + orders.size());
        return orders;
    }

    @ShellMethod("Get order by id")
    public OrderResponse byId(@ShellOption("-id") long id) {
        ByIdRequest byIdRequest = new ByIdRequest();
        byIdRequest.setId(id);
        try {
            OrderResponse order = orderService.getOrderById(byIdRequest);
            Assert.notNull(order, "order not found");
            logger.info("retrieving the order: " + order.toString());
            return order;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @ShellMethod("Create new order")
    public String create(@ShellOption("-cid") long carId, @ShellOption("-csid") long customerId) {
        CreateOrderRequest request = new CreateOrderRequest();
        request.setCarId(carId);
        request.setCustomerId(customerId);

        try {
            orderService.createOrder(request);
            logger.info("order was successfully created");
            return "order was successfully created";
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
    }

    @ShellMethod("Update order status")
    public String update(@ShellOption("-id") long id, @ShellOption("-sts") String status) {
        UpdateOrderRequest request = new UpdateOrderRequest();
        request.setId(id);
        request.setStatus(status);

        try {
            orderService.updateOrder(request);
            logger.info("order was successfully created");
            return "order was successfully updated";
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
    }

    @ShellMethod("Get orders by customer id and status")
    public List<OrderResponse> get(@ShellOption("-csid") long customerId, @ShellOption("-sts") String status) {
        ByCustomerIdAndStatusRequest request = new ByCustomerIdAndStatusRequest();
        request.setCustomerId(customerId);
        request.setStatus(status);
        List<OrderResponse> orders = orderService.getOrdersByCustomerIdAndStatus(request);
        logger.info("retrieving a list of all orders for customer with id: " + customerId + ", size: " + orders.size());
        return orders;
    }

    @ShellMethod("Delete order by id")
    public String delete(@ShellOption("-id") long id) {
        ByIdRequest request = new ByIdRequest();
        request.setId(id);

        try {
            orderService.deleteOrder(request);
            logger.info("order was successfully deleted");
            return "order was successfully deleted";
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
    }
}
