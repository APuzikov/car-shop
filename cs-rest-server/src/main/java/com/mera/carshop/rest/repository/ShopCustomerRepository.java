package com.mera.carshop.rest.repository;

import com.mera.carshop.rest.entity.ShopCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopCustomerRepository extends JpaRepository<ShopCustomer, Long> {
}

