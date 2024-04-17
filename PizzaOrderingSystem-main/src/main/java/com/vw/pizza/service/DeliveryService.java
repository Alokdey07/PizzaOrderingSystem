package com.vw.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.pizza.dao.DeliveryDaoImpl;
import com.vw.pizza.entity.Delivery;

@Service
public class DeliveryService {
	@Autowired
	private DeliveryDaoImpl delDaoImpl;

	public String deliveryDetailsAdd(Delivery delivery) {

		return delDaoImpl.deliveryDetailsAdd(delivery);
	}

	public String deliveryDetailsPerKM(Integer km) {
		// TODO Auto-generated method stub
		return delDaoImpl.deliveryDetailsPerKM(km);
	}

}
