package com.vw.pizza.controller;	
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.entity.Order;
import com.vw.pizza.dto.CustomerDto;
import com.vw.pizza.entity.Customer;
import com.vw.pizza.exception.CustomerNotFound;
import com.vw.pizza.repo.CustomerRepository;
import com.vw.pizza.service.CustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerRepository customerRepository;

	@PutMapping("/{cid}/address")
	public ResponseEntity<String> upadteAddressById(@PathVariable Long cid, @RequestBody String newAddress) {
		try {
	    customerService.upadteAddressById(cid, newAddress);
	    return ResponseEntity.ok("Address updated succesfully");
		} catch(CustomerNotFound ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCustomerById(@PathVariable("cid") Long cid){
		try {
		    customerService.deleteCustomerById(cid);
		    return ResponseEntity.ok("Customer deleted succesfully");
			} catch(CustomerNotFound ex) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
			}
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerCustomer(@RequestBody CustomerDto customerDto) {
		Customer customer = customerService.registerCustomer(customerDto);
		return new ResponseEntity<>(customer,HttpStatus.CREATED);
	}
	
	@GetMapping("/{customerId}")
	public ResponseEntity<?> getCustomersById(@PathVariable Long cid){
		Customer customer = customerService.getcustomerById(cid);
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/{customerId}/orders")
	public ResponseEntity<?> getCustomerOrders(@PathVariable Long cid){
		Optional<Order> orders = customerService.getCustomerOrders(cid);
		return new ResponseEntity<>(orders,HttpStatus.OK);
	}
	
	
	
	
}
