package com.vw.pizza.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vw.pizza.entity.Delivery;
import com.vw.pizza.repo.DeliveryRepository;

@Component
public class DeliveryDaoImpl implements DeliveryDao {
	@Autowired
	private DeliveryRepository delRepository;

	public String deliveryDetailsAdd(Delivery delivery) {
		// TODO Auto-generated method stub
		 delRepository.save(delivery);
		 return"Data saved";
	}

	public String deliveryDetailsPerKM(Integer km) {
		String time = "";

		if (km < 10) {
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime halfAnHourLater = now.plusMinutes(30);
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String formated = now.format(format);
			time = halfAnHourLater.format(format);
		}
		return time;
	}

	public String deliveryConfimation(boolean isAccepted) {
		// TODO Auto-generated method stub
		return null;
	}

}
