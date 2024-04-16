package com.vw.pizza.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.pizza.dao.CustomerDao;
import com.vw.pizza.entity.Customer;
import com.vw.pizza.repo.CustomerRepository;
@Service
public class CustomerImpl implements CustomerDao {

	@Autowired CustomerRepository customerRepository;
	public Customer updateAddress(Long cid,String newAddress) {
		Customer customer = customerRepository.findById(cid).orElseThrow(() -> new RuntimeException("No address found in this id"));
		customer.setAddress(newAddress);
		return customerRepository.save(customer);
		
	}

}
