package com.vw.pizza.dao;

import java.util.Optional;


import com.vw.pizza.dto.CustomerDto;
import com.vw.pizza.entity.Customer;
import com.vw.pizza.entity.Order;

public interface CustomerDao {

	public Customer upadteAddressById(Long cid, String newAddress);
	public void deleteCustomerById(Long cid);
	public Customer registerCustomer(CustomerDto customerDto);
	public Customer getcustomerById(Long cid);
	public Optional<Order> getCustomerOrders(Long cid);
	//public boolean cancelOrder(Long cid, Long oid);
}
