package com.vw.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.pizza.entity.Customer;
import com.vw.pizza.entity.Delivery;
import com.vw.pizza.impl.DeliveryDaoImpl;

@Service
public class DeliveryService {
	@Autowired
	private DeliveryDaoImpl delDaoImpl;

	public String deliveryDetailsAdd(Delivery delivery) {

		return delDaoImpl.deliveryDetailsAdd(delivery);
	}

	public List<Delivery> getDeliveryDetails() {
		return delDaoImpl.getDeliveryDetails();
	}

	public Delivery findByIDDelivery(Long id) {
		return delDaoImpl.findByIDDelivery(id);
	}

	public Delivery findByLocation(String address) {
		// TODO Auto-generated method stub
		return delDaoImpl.findByLocation(address);
	}

	public String deliveryConfimation(Long id, boolean isAccepted) {
		return delDaoImpl.deliveryConfimation(id, isAccepted);
	}
	public String orderDeliveredOrNotDelivered(boolean isDelivered) {
		return delDaoImpl.orderDeliveredOrNotDelivered(isDelivered);
	}

}
