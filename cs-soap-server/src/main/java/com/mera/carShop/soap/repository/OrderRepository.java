package com.mera.carShop.soap.repository;

import com.mera.carShop.soap.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByStatusAndCustomerId(String status, long customerId);
    Order findByCarId(long carId);
}