package com.vw.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.pizza.dto.DeliveryDto;
import com.vw.pizza.entity.Delivery;
import com.vw.pizza.impl.DeliveryDaoImpl;

@Service
public class DeliveryService {
	@Autowired
	private DeliveryDaoImpl delDaoImpl;

	public String deliveryDetailsAdd(DeliveryDto deliveryDto) {

		return delDaoImpl.deliveryDetailsAdd(deliveryDto);
	}

	public List<Delivery> getDeliveryDetails() {
		return delDaoImpl.getDeliveryDetails();
	}

	public Delivery findByOrderId(Long id) {
		return delDaoImpl.findByOrderId(id);
	}

	

	public String deliveryConfimation(Long id, boolean isAccepted) {
		return delDaoImpl.deliveryConfimation(id, isAccepted);
	}
	public String orderDeliveredOrNotDelivered(Long oid,boolean isDelivered) {
		return delDaoImpl.orderDeliveredOrNotDelivered(oid, isDelivered);
	}

}
