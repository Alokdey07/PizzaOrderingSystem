package com.vw.pizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.pizza.dto.DeliveryDto;
import com.vw.pizza.entity.Delivery;
import com.vw.pizza.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
	@Autowired
	private DeliveryService delService;

	@PostMapping("/post")
	public String deliveryDetailsAdd(@RequestBody DeliveryDto deliveryDto) {

		return delService.deliveryDetailsAdd(deliveryDto);
	}

	@GetMapping("/deliveryDetails")
	public List<Delivery> getDeliveryDetails() {
		return delService.getDeliveryDetails();
	}

	@GetMapping("/findById/{oids}")
	public Delivery findByOrderId(@PathVariable Long oids) {
		return delService.findByOrderId(oids);
	}


	@GetMapping("/deliveryConfimation/{id}/{isAccepted}")
	public String deliveryConfimation(@PathVariable Long id, @PathVariable boolean isAccepted) {
		return delService.deliveryConfimation(id, isAccepted);
	}

	@GetMapping("/od/{oid}/{isDelivered}")
	public String orderDeliveredOrNotDelivered(@PathVariable Long oid, @PathVariable boolean isDelivered) {
		return delService.orderDeliveredOrNotDelivered(oid, isDelivered);
	}
}
