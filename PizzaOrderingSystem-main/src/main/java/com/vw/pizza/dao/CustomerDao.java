package com.vw.pizza.dao;

import com.vw.pizza.entity.Customer;

public interface CustomerDao {

	public Customer updateAddress(Long cid, String newAddress);

}
