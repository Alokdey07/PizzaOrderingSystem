package com.vw.pizza.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.entity.Order;
import com.vw.pizza.dao.CustomerDao;
import com.vw.pizza.dto.CustomerDto;
import com.vw.pizza.entity.Customer;
@Service
public class CustomerService {
	@Autowired
	CustomerDao customerDao;
	public Customer upadteAddressById(Long cid, String newAddress) {
		return customerDao.upadteAddressById(cid,newAddress);

	}
	public void deleteCustomerById(Long cid) {
		 customerDao.deleteCustomerById(cid);

	}
	public Customer upadteAddressByIdOrName(Long cid, String name) {
		return customerDao.upadteAddressById(cid,name);

	}
	public Customer registerCustomer(CustomerDto customerDto) {
		return customerDao.registerCustomer(customerDto);
	}
	public Customer getcustomerById(Long cid) {
		return customerDao.getcustomerById(cid);
	}
	public Optional<Order> getCustomerOrders(Long cid) {
		return customerDao.getCustomerOrders(cid);
	}
}
