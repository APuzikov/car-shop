package com.mera.carShop.soap.repository;

import com.mera.carShop.soap.entity.CarOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOptionRepository extends JpaRepository<CarOption, Integer> {
}
