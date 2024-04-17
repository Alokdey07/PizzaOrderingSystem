package com.vw.pizza.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vw.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{

}
