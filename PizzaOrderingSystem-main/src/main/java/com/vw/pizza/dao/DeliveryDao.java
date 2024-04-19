package com.vw.pizza.dao;

import java.util.List;
import java.util.Optional;

import com.vw.pizza.dto.DeliveryDto;
import com.vw.pizza.entity.Delivery;

public interface DeliveryDao {
	public String deliveryDetailsAdd(DeliveryDto deliveryDto);


	public Delivery findByOrderId(Long did);

	public List<Delivery> getDeliveryDetails();

	public String deliveryConfimation(Long oid, boolean isAccepted);

	public String orderDeliveredOrNotDelivered(Long oid, boolean isDelivered);
}
