package com.vw.pizza.repo;


import com.vw.pizza.entity.Pizza;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

	List<Pizza> findByType(String type);

	List<Pizza> findByTypeNot(String type);

	List<Pizza> findByPriceLessThan(double price);

	List<Pizza> findByPriceGreaterThan(double price);

	List<Pizza> findBySize(String size);

	List<Pizza> findBySizeAndType(String size, String type);

}
