package com.vw.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.pizza.dao.CustomerDao;
import com.vw.pizza.entity.Customer;
@Service
public class CustomerService {
	@Autowired
	CustomerDao customerDao;
	public Customer updateAddress(Long cid, String newAddress) {
		return customerDao.updateAddress(cid,newAddress);

	}
}
