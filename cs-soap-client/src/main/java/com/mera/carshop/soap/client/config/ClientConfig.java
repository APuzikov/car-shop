package com.mera.carshop.soap.client.config;

import com.mera.carshop.soap.service.OrderService;
import com.mera.carshop.soap.service.OrderServiceImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

//    private OrderService orderService;
//
//    @Autowired
//    public ClientConfig(OrderService orderService) {
//        this.orderService = orderService;
//    }

    @Bean
    public OrderService createOrderServiceProxy() {
        OrderServiceImplService orderServiceImplService = new OrderServiceImplService();
        return orderServiceImplService.getOrderServiceImplPort();
    }
}
