package com.mera.carShop.soap.repository;

import com.mera.carShop.soap.entity.CarColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarColorRepository extends JpaRepository<CarColor, Integer> {
}
