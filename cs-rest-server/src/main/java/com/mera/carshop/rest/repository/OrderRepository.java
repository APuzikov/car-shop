package com.mera.carshop.rest.repository;

import com.mera.carshop.rest.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByStatus(String status);
    List<Order> findByStatusAndCustomerId(String status, long customerId);
    Order findByCarId(long carId);
}