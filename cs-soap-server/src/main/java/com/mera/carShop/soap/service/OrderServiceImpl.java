package com.mera.carShop.soap.service;

import com.mera.carShop.soap.entity.Car;
import com.mera.carShop.soap.entity.Order;
import com.mera.carShop.soap.entity.ShopCustomer;
import com.mera.carShop.soap.model.ByCustomerIdAndStatusRequest;
import com.mera.carShop.soap.model.ByIdRequest;
import com.mera.carShop.soap.model.CreateOrderRequest;
import com.mera.carShop.soap.model.OrderResponse;
import com.mera.carShop.soap.model.Status;
import com.mera.carShop.soap.model.UpdateOrderRequest;
import com.mera.carShop.soap.repository.CarRepository;
import com.mera.carShop.soap.repository.OrderRepository;
import com.mera.carShop.soap.repository.ShopCustomerRepository;
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
public class OrderServiceImpl implements OrderService{

    private static final Logger logger = LogManager.getLogger(OrderServiceImpl.class);

    private OrderRepository orderRepository;
    private CarRepository carRepository;
    private ShopCustomerRepository customerRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, CarRepository carRepository, ShopCustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.carRepository = carRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void createOrder(CreateOrderRequest request) {
        Assert.notNull(request, "order is null");

        Car car = carRepository.findById(request.getCarId()).orElse(null);
        Assert.notNull(car, "car not found");

        ShopCustomer customer = customerRepository.findById(request.getCustomerId()).orElse(null);
        Assert.notNull(customer, "customer not found");

        Order existOrder = orderRepository.findByCarId(car.getId());
        Assert.isNull(existOrder, "this car is already ordered");

        Order order = new Order();
        order.setCarId(request.getCarId());
        order.setCustomerId(request.getCustomerId());
        order.setStatus(Status.ACCEPTED.toString());
        order.setDate(new Date().toString());

        try {
            Order savedOrder = orderRepository.save(order);
            logger.info("created order: " + savedOrder.toString());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void updateOrder(UpdateOrderRequest request) {
        Order order = orderRepository.findById(request.getId()).orElse(null);
        Assert.notNull(order, "order not found");

        Assert.isTrue(checkStatus(request.getStatus()), "wrong status");
        Assert.isTrue(!order.getStatus().equals(request.getStatus().toUpperCase()), "order is already in this status");

        order.setDate(new Date().toString());
        order.setStatus(request.getStatus().toUpperCase());

        try {
            Order updatedOrder = orderRepository.save(order);
            logger.info("updated order: " + updatedOrder.toString());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void deleteOrder(ByIdRequest request) {
        Order order = orderRepository.findById(request.getId()).orElse(null);
        Assert.notNull(order, "order not found");

        orderRepository.deleteById(request.getId());
        logger.info("deleted order: " + order.toString());
    }

    @Override
    public List<OrderResponse> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        List<OrderResponse> orderResponses = new ArrayList<>();
        orders.forEach(order -> orderResponses.add(fromOrder(order)));
        logger.info("received a list of all orders, size: " + orders.size());
        return orderResponses;
    }

    @Override
    public OrderResponse getOrderById(ByIdRequest request) {
        try {
            Order order = orderRepository.findById(request.getId()).orElse(null);
            Assert.notNull(order, "order not found");
            return fromOrder(order);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<OrderResponse> getOrdersByCustomerIdAndStatus(ByCustomerIdAndStatusRequest request) {
        List<Order> orders = orderRepository.findByStatusAndCustomerId(request.getStatus(), request.getCustomerId());
        List<OrderResponse> orderResponses = new ArrayList<>();
        orders.forEach(order -> orderResponses.add(fromOrder(order)));
        logger.info("received a list of all orders for customer with id: " + request.getCustomerId()+ ", size: " + orders.size());
        return orderResponses;
    }

    private boolean checkStatus(String status) {
        return Arrays.stream(Status.values()).anyMatch(status1 -> status1.toString().equals(status.toUpperCase()));
    }

    private OrderResponse fromOrder(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(order.getId());
        orderResponse.setCarId(order.getCarId());
        orderResponse.setCustomerId(order.getCustomerId());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setDate(order.getDate());
        return orderResponse;
    }
}
