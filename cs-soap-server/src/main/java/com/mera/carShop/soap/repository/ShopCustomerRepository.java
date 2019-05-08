package com.mera.carShop.soap.repository;

import com.mera.carShop.soap.entity.ShopCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopCustomerRepository extends JpaRepository<ShopCustomer, Long> {
}

