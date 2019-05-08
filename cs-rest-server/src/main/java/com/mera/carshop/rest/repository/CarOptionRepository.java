package com.mera.carshop.rest.repository;

import com.mera.carshop.rest.entity.CarOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOptionRepository extends JpaRepository<CarOption, Integer> {
}
