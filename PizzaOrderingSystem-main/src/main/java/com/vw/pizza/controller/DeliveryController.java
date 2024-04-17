package com.vw.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.pizza.entity.Delivery;
import com.vw.pizza.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
	@Autowired
	private DeliveryService delService;

	@PostMapping("/post")
	public String deliveryDetailsAdd(@RequestBody Delivery delivery) {

		return delService.deliveryDetailsAdd(delivery);
	}

	@PostMapping("/deliveryTime/{id}")
	public String deliveryDetailsPerKM(@RequestBody Integer km) {
		return delService.deliveryDetailsPerKM(km);
	}
}
