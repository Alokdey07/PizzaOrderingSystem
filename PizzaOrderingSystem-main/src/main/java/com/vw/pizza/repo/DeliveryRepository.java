package com.vw.pizza.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vw.pizza.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer>{

}
