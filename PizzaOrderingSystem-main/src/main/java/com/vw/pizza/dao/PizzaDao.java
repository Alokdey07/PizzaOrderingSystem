package com.vw.pizza.dao;

import java.util.List;

import com.vw.pizza.entity.Pizza;

public interface PizzaDao {
	public List<Pizza> getListOfPizza();

	public Pizza addPizza(Pizza pizza);

	public Pizza updatePizza(Pizza pizza);

	public Pizza getPizzaById(Long id);

	void deletePizza(Long id);
}