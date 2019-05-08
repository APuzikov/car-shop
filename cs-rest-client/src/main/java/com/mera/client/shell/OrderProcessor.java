package com.mera.client.shell;

import com.mera.client.data.Order;
import com.mera.client.web.CarShopOrder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;

@ShellComponent
public class OrderProcessor {

    private static final Logger logger = LogManager.getLogger(OrderProcessor.class);

    private CarShopOrder carShopOrder;

    @Autowired
    public OrderProcessor(CarShopOrder carShopOrder) {
        this.carShopOrder = carShopOrder;
    }

    @ShellMethod("Get all orders.")
    public List<Order> all() {
        return carShopOrder.getAllOrders();
    }

    @ShellMethod("Get order by id.")
    public String byid(long id) {
//        try {
//            String order = carShopOrder.getOrderById(id);
//            Assert.notNull(order, "order not found");
//            return order;
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//            return null;
//        }
        return carShopOrder.getOrderById(id);
    }

    @ShellMethod("Create new order.")
    public String create(long carId, long customerId) {
        return carShopOrder.createNewOrder(carId, customerId);
    }

    @ShellMethod("Delete order by id.")
    public String delete(long id) {
        return carShopOrder.deleteOrder(id);
    }

    @ShellMethod("Update order status by id.")
    public String update(long id, String status) {
        return carShopOrder.updateOrder(id, status);
    }

    @ShellMethod("Get orders by customer id and status.")
    public List<Order> get(long customerId, String status) {
        return carShopOrder.getOrdersByCustomerIdAndStatus(customerId, status);
    }
}
