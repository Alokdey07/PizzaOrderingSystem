package com.vw.pizza.dao;

import java.util.List;
import java.util.Optional;

import com.vw.pizza.entity.Delivery;

public interface DeliveryDao {
	public String deliveryDetailsAdd(Delivery delivery);

	//public Delivery findByLocation(String address);

	public Delivery findByIDDelivery(Long id);

	public List<Delivery> getDeliveryDetails();

	public String deliveryConfimation(Long id, boolean isAccepted);

	public String orderDeliveredOrNotDelivered(boolean isDelivered);
}
