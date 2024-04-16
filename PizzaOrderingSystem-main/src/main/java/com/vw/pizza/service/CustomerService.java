package com.vw.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vw.pizza.dao.CustomerDao;
import com.vw.pizza.entity.Customer;

public class CustomerService {
	@Autowired
	CustomerDao customerDao;
	public Customer updateAddress(Long cid, String newAddress) {
		return customerDao.updateAddress(cid,newAddress);

	}
}
