package com.vw.pizza.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vw.pizza.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
