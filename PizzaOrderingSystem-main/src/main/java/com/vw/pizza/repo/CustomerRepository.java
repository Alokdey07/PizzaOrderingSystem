package com.vw.pizza.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vw.pizza.entity.Customer;
import com.vw.pizza.entity.Order;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
