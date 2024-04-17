package com.vw.pizza.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vw.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{

	Optional<Order> findByIdAndCid(Long oid, Long cid);

}
