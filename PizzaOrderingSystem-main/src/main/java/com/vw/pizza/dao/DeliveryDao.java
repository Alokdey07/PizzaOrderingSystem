package com.vw.pizza.dao;

import com.vw.pizza.entity.Delivery;

public interface DeliveryDao {
	public String deliveryDetailsAdd(Delivery delivery);
	public String deliveryDetailsPerKM(Integer km);
	public String deliveryConfimation(boolean isAccepted);
}
