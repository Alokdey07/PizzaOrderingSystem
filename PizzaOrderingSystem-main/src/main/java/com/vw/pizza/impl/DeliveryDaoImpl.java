package com.vw.pizza.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vw.pizza.dao.DeliveryDao;
import com.vw.pizza.dto.DeliveryDto;
import com.vw.pizza.entity.Delivery;
import com.vw.pizza.exception.DeliveryIssueException;
import com.vw.pizza.repo.CustomerRepository;
import com.vw.pizza.repo.DeliveryRepository;

@Component
public class DeliveryDaoImpl implements DeliveryDao {
	@Autowired
	private DeliveryRepository delRepository;
	@Autowired
	private CustomerRepository custRepository;

	public String deliveryDetailsAdd(DeliveryDto deliveryDto) {
		Delivery delivery = new Delivery();
		delivery.setdId(deliveryDto.getDid());
		delivery.setMobileNo(deliveryDto.getMobileNo());
		delivery.setIsAccepted(deliveryDto.getIsAccepted());
		delivery.setIsDelivered(deliveryDto.getIsAccepted());
		delivery.setDeliveryAddress(deliveryDto.getDeliveryAddress());
		delivery.setDeliveryTime(deliveryDto.getDeliveryTime());
		delRepository.save(delivery);
		return "Data saved";
	}

	@Override
	public List<Delivery> getDeliveryDetails() {
		return delRepository.findAll();
	}

	@Override
	public Delivery findByOrderId(Long did) {

		return delRepository.findById(did).get();
	}

	@Override
	public String deliveryConfimation(Long oid, boolean isAccepted) {

		if (isAccepted == true) {
			Delivery delivery = delRepository.findById(oid).get();
			return "Order is Accepted" + delivery;
		}
		throw new DeliveryIssueException("Delivery is not Accepted");

	}

	public String orderDeliveredOrNotDelivered(Long oid, boolean isDelivered) {

		if (isDelivered = true) {
			Delivery delivery = delRepository.findById(oid).get();
			return "order delivered" + delivery;
		}
		throw new DeliveryIssueException("Order is on the Way and sorry for delay");
	}

}
