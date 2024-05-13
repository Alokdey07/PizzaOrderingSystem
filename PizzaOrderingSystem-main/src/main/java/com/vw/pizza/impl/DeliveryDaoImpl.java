package com.vw.pizza.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vw.pizza.dao.DeliveryDao;
import com.vw.pizza.entity.Delivery;
import com.vw.pizza.repo.DeliveryRepository;

@Component
public class DeliveryDaoImpl implements DeliveryDao {
	@Autowired
	private DeliveryRepository delRepository;

	public String deliveryDetailsAdd(Delivery delivery) {

		delRepository.save(delivery);
		return "Data saved";
	}

	@Override
	public List<Delivery> getDeliveryDetails() {
		return delRepository.findAll();
	}

	@Override
	public Delivery findByIDDelivery(Long id) {

		return delRepository.findById(id).get();
	}

	@Override
	public String deliveryConfimation(Long id, boolean isAccepted) {
		Delivery delivery = delRepository.findById(id).get();
		if (delivery.getIsDelivered() == true) {

		}
		return "Order Accepted" + delivery;

	}

	/*
	 * @Override public Delivery findByLocation(String address) { Delivery delivery
	 * = delRepository.findByAddress(address); return delivery; }
	 */

	@Override
	public String orderDeliveredOrNotDelivered(boolean isDelivered) {
		Delivery delivery = delRepository.isDelivered(isDelivered);
		if (isDelivered = true) {

		}
		return "order delivered" + delivery;
	}

}
