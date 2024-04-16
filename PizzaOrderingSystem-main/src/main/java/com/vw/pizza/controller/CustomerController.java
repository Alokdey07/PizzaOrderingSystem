package com.vw.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.pizza.service.CustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@PutMapping("/{cid}/address")
	public ResponseEntity<String> upadteAddress(@PathVariable Long cid, @RequestBody String newAddress) {
	    customerService.updateAddress(cid, newAddress);
	    return ResponseEntity.ok("Address updated succesfully");
	}
}
