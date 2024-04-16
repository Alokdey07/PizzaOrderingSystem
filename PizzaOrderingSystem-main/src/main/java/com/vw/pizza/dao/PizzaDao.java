package com.vw.pizza.dao;

import java.util.List;

import com.vw.pizza.entity.Pizza;

public interface PizzaDao {

	public String addPizza(Pizza pizza);

	public String deletePizza(int id);

	public String updatePizza(int id, Pizza pizza);

	public List<Pizza> getAllPizzas();

	public Pizza getPizzaById(int id);

	public Pizza searchPizza(int id);

	public List<Pizza> getVegetarianPizzas();

	public List<Pizza> getNonVegetarianPizzas();

	public List<Pizza> getPizzasByPriceLessThan(double price);

	public List<Pizza> getPizzasByPriceGreaterThan(double price);

	public List<Pizza> getPizzasBySize(String size);

	public List<Pizza> getPizzasBySizeAndType(String size, String type);
}
