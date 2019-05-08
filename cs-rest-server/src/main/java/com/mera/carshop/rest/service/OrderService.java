package com.mera.carshop.rest.service;

import com.mera.carshop.rest.entity.Car;
import com.mera.carshop.rest.entity.Order;
import com.mera.carshop.rest.entity.ShopCustomer;
import com.mera.carshop.rest.model.OrderDTO;
import com.mera.carshop.rest.model.Status;
import com.mera.carshop.rest.repository.CarRepository;
import com.mera.carshop.rest.repository.OrderRepository;
import com.mera.carshop.rest.repository.ShopCustomerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    private static final Logger logger = LogManager.getLogger(OrderService.class);

    private OrderRepository orderRepository;
    private CarRepository carRepository;
    private ShopCustomerRepository customerRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, CarRepository carRepository, ShopCustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.carRepository = carRepository;
        this.customerRepository = customerRepository;
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Assert.notNull(orderDTO, "order is null");

        Car car = carRepository.findById(orderDTO.getCarId()).orElse(null);
        Assert.notNull(car, "car not found");

        ShopCustomer customer = customerRepository.findById(orderDTO.getCustomerId()).orElse(null);
        Assert.notNull(customer, "customer not found");

        Order existOrder = orderRepository.findByCarId(car.getId());
        Assert.isNull(existOrder, "this car is already ordered");

        Order order = orderRepository.save(fromOrderDTO(orderDTO));
        logger.info("created order: " + order.toString());
        return fromOrder(order);
    }

    public Order updateOrder(long id, String status) {
        Order order = orderRepository.findById(id).orElse(null);
        Assert.notNull(order, "order not found");

        Assert.isTrue(checkStatus(status), "wrong status");
        Assert.isTrue(!order.getStatus().equals(status.toUpperCase()), "order is already in this status");

        order.setDate(new Date().toString());
        order.setStatus(status.toUpperCase());

        logger.info("updated order: " + order.toString());
        return orderRepository.save(order);
    }

    public void deleteOrder(long id) {
        Order order = orderRepository.findById(id).orElse(null);
        Assert.notNull(order, "order not found");

        logger.info("deleted order: " + order.toString());
        orderRepository.deleteById(id);
    }

    public List<OrderDTO> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        List<OrderDTO> orderDTOS = new ArrayList<>();
        orders.forEach(order -> orderDTOS.add(fromOrder(order)));
        logger.info("received a list of all orders, size: " + orderDTOS.size());
        return orderDTOS;
    }

    public OrderDTO getOrderById(long id) {
        Order order = orderRepository.findById(id).orElse(null);
        Assert.notNull(order, "order not found");
        logger.info("received the order: " + order.toString());
        return fromOrder(order);
    }

    public List<OrderDTO> getOrdersByCustomerIdAndStatus(long customerId, String status) {
        List<Order> orders = orderRepository.findByStatusAndCustomerId(status, customerId);
        List<OrderDTO> orderDTOS = new ArrayList<>();
        orders.forEach(order -> orderDTOS.add(fromOrder(order)));
        logger.info("received a list of orders for customer with id:" + customerId + ", size: " + orderDTOS.size());
        return orderDTOS;
    }

    private boolean checkStatus(String status) {
        return Arrays.stream(Status.values()).anyMatch(status1 -> status1.toString().equals(status.toUpperCase()));
    }

    private OrderDTO fromOrder(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setCarId(order.getCarId());
        orderDTO.setCustomerId(order.getCustomerId());
        orderDTO.setStatus(order.getStatus());
        orderDTO.setDate(order.getDate());
        return orderDTO;
    }

    private Order fromOrderDTO(OrderDTO orderDTO) {
        Order order = new Order();
        order.setCarId(orderDTO.getCarId());
        order.setCustomerId(orderDTO.getCustomerId());
        order.setDate(orderDTO.getDate());
        order.setStatus(orderDTO.getStatus());
        if (orderDTO.getId() != null) {
            order.setId(orderDTO.getId());
        }
        return order;
    }
}
