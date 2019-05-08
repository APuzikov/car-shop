package com.mera.carshop.rest.repository;

import com.mera.carshop.rest.entity.CarColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarColorRepository extends JpaRepository<CarColor, Integer> {
}
