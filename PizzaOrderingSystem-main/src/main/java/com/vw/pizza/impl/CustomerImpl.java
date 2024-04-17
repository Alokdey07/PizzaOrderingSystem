package com.vw.pizza.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vw.pizza.dao.CustomerDao;
import com.vw.pizza.entity.Customer;
import com.vw.pizza.exception.CustomerNotFound;
import com.vw.pizza.repo.CustomerRepository;
@Component
public class CustomerImpl implements CustomerDao {

	@Autowired CustomerRepository customerRepository;
	public Customer updateAddress(Long cid,String newAddress) {
		Customer customer = customerRepository.findById(cid).orElseThrow(() -> new CustomerNotFound("No address found in this id"));
		customer.setAddress(newAddress);
		return customerRepository.save(customer);
		
	}

}
