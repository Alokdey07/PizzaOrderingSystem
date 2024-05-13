package com.vw.pizza.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vw.pizza.entity.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
	//public Delivery findByAddress(String address);

	public Delivery isDelivered(boolean status);
}
