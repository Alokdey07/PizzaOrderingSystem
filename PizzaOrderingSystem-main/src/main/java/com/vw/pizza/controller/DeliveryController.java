package com.vw.pizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.pizza.entity.Customer;
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

	@GetMapping("/deliveryDetails")
	public List<Delivery> getDeliveryDetails() {
		return delService.getDeliveryDetails();
	}

	@GetMapping("/findById/{id}")
	public Delivery findByIDDelivery(@PathVariable Long id) {
		return delService.findByIDDelivery(id);
	}

	@GetMapping("/findByLocation/{address}")
	public Delivery findByLocation(@PathVariable String address) {
		return delService.findByLocation(address);
	}

	@GetMapping
	public String deliveryConfimation(Long id, boolean isAccepted) {
		return delService.deliveryConfimation(id, isAccepted);
	}

	@GetMapping
	public String orderDeliveredOrNotDelivered(boolean isDelivered) {
		return delService.orderDeliveredOrNotDelivered(isDelivered);
	}
}
