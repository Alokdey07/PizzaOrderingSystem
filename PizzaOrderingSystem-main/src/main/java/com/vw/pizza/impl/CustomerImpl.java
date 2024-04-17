package com.vw.pizza.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vw.entity.Order;
import com.vw.pizza.dao.CustomerDao;
import com.vw.pizza.dto.CustomerDto;
import com.vw.pizza.entity.Customer;
import com.vw.pizza.exception.CustomerNotFound;
import com.vw.pizza.repo.CustomerRepository;
import com.vw.pizza.repo.OrderRepo;
@Component
public class CustomerImpl implements CustomerDao {

	@Autowired CustomerRepository customerRepository;
	@Autowired OrderRepo orderRepo;
	public Customer upadteAddressById(Long cid,String newAddress) {
		Customer customer = customerRepository.findById(cid).orElseThrow(() -> new CustomerNotFound("No address found in this id"));
		customer.setAddress(newAddress);
		return customerRepository.save(customer);
		
	}
	@Override
	public void deleteCustomerById(Long cid) {
		if(!customerRepository.existsById(cid)) {
			throw new CustomerNotFound("No Customer found");
		}
		customerRepository.deleteById(cid);
	}
	@Override
	public Customer registerCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setFname(customerDto.getFname());
		customer.setLname(customerDto.getLname());
		customer.setAddress(customerDto.getAddress());
		customer.setEmail(customerDto.getEmail());
		customer.setMobile(customerDto.getMobile());
		return customerRepository.save(customer);
	}
	@Override
	public Customer getcustomerById(Long cid) {
		Customer customer = customerRepository.findById(cid).orElseThrow(() -> new CustomerNotFound("No address found in this id"));
		return customer;
	}
	@Override
	public Optional<Order> getCustomerOrders(Long cid) {
		if(customerRepository.existsById(cid)) {
			return orderRepo.findById(cid);
		}
		 throw new CustomerNotFound("No order found with this customer id");
	}
	@Override
	public boolean cancelOrder(Long cid, Long oid) {
		Optional<Customer> customer = customerRepository.findById(cid);
		if(customer.isPresent()) {
			Optional<Order>optionalOrder = orderRepo.findByIdAndCid(oid,cid);
			if(optionalOrder.isPresent()) {
				Order order = optionalOrder.get();
				order.setCancelled(true);
				orderRepo.save(order);
				return true;
			}
		}
		return false;
	}

}
