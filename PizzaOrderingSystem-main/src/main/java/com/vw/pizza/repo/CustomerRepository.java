package com.vw.pizza.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vw.pizza.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
