package com.vw.pizza.service;

import com.vw.pizza.exception.*;
import com.vw.pizza.dao.PizzaDao;
import com.vw.pizza.entity.Pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

	@Autowired
	private PizzaDao pizzaDao;

	public String addPizza(Pizza pizza) {
		return pizzaDao.addPizza(pizza);
	}

	public String deletePizza(int id) {
		return pizzaDao.deletePizza(id);
	}

	public String updatePizza(int id, Pizza pizza) {
		return pizzaDao.updatePizza(id, pizza);
	}

	public List<Pizza> getAllPizzas() {
		return pizzaDao.getAllPizzas();
	}

	public Pizza getPizzaById(int id) {
		return pizzaDao.getPizzaById(id);
	}

	public Pizza searchPizza(int id) {
		return pizzaDao.searchPizza(id);
	}

	public List<Pizza> getVegetarianPizzas() {
		return pizzaDao.getVegetarianPizzas();
	}

	public List<Pizza> getNonVegetarianPizzas() {
		return pizzaDao.getNonVegetarianPizzas();
	}

	public List<Pizza> getPizzasByPriceLessThan(double price) {
		return pizzaDao.getPizzasByPriceLessThan(price);
	}

	public List<Pizza> getPizzasByPriceGreaterThan(double price) {
		return pizzaDao.getPizzasByPriceGreaterThan(price);
	}

	public List<Pizza> getPizzasBySize(String size) {
		return pizzaDao.getPizzasBySize(size);
	}

	public List<Pizza> getPizzasBySizeAndType(String size, String type) {
		return pizzaDao.getPizzasBySizeAndType(size, type);
	}
}
