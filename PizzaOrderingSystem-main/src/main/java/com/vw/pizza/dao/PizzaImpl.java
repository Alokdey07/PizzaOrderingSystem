package com.vw.pizza.dao;

import com.vw.pizza.entity.Pizza;
import com.vw.pizza.exception.PizzaNotFoundException;
import com.vw.pizza.repo.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PizzaImpl implements PizzaDao {

	@Autowired
	private PizzaRepository pizzaRepository;

	@Override
	public String addPizza(Pizza pizza) {
		pizzaRepository.save(pizza);
		return "Pizza added successfully";
	}

	@Override
	public String deletePizza(int id) {
		if (!pizzaRepository.existsById(id)) {
			throw new PizzaNotFoundException("Pizza not found");
		}
		pizzaRepository.deleteById(id);
		return "Pizza deleted successfully";
	}

	@Override
	public String updatePizza(int id, Pizza pizza) {
		Optional<Pizza> existingPizza = pizzaRepository.findById(id);
		if (existingPizza.isPresent()) {
			Pizza pizzaToUpdate = existingPizza.get();
			pizzaToUpdate.setType(pizza.getType());
			pizzaToUpdate.setName(pizza.getName());
			pizzaToUpdate.setDescription(pizza.getDescription());
			pizzaToUpdate.setPrice(pizza.getPrice());
			pizzaToUpdate.setSize(pizza.getSize());
			pizzaToUpdate.setCrust(pizza.getCrust());
			pizzaRepository.save(pizzaToUpdate);
			return "Pizza updated successfully";
		} else {
			throw new PizzaNotFoundException("Pizza not found");
		}
	}

	@Override
	public List<Pizza> getAllPizzas() {
		return pizzaRepository.findAll();
	}

	@Override
	public Pizza getPizzaById(int id) {
		Optional<Pizza> optionalPizza = pizzaRepository.findById(id);
		if (optionalPizza.isPresent()) {
			return optionalPizza.get();
		} else {
			throw new PizzaNotFoundException("Pizza not found");
		}
	}

	@Override
	public List<Pizza> getVegetarianPizzas() {
		return pizzaRepository.findByType("Vegetarian");
	}

	@Override
	public List<Pizza> getNonVegetarianPizzas() {
		return pizzaRepository.findByType("Non-Vegetarian");
	}

	@Override
	public Pizza searchPizza(int id) {
		Optional<Pizza> optionalPizza = pizzaRepository.findById(id);
		if (optionalPizza.isPresent()) {
			return optionalPizza.get();
		} else {
			throw new PizzaNotFoundException("Pizza not found");
		}
	}

	@Override
	public List<Pizza> getPizzasByPriceLessThan(double price) {
		return pizzaRepository.findByPriceLessThan(price);
	}

	@Override
	public List<Pizza> getPizzasByPriceGreaterThan(double price) {
		return pizzaRepository.findByPriceGreaterThan(price);
	}

	@Override
	public List<Pizza> getPizzasBySize(String size) {
		return pizzaRepository.findBySize(size);
	}

	@Override
	public List<Pizza> getPizzasBySizeAndType(String size, String type) {
		return pizzaRepository.findBySizeAndType(size, type);
	}
}
