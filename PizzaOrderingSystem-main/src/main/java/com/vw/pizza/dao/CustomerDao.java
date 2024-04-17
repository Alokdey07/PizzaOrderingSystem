package com.vw.pizza.dao;

import com.vw.pizza.dto.CustomerDto;
import com.vw.pizza.entity.Customer;

public interface CustomerDao {

	public Customer upadteAddressById(Long cid, String newAddress);
	public void deleteCustomerById(Long cid);
	public Customer registerCustomer(CustomerDto customerDto);
	public Customer getcustomerById(Long cid);
}
