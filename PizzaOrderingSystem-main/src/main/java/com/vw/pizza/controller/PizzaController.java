package com.vw.pizza.controller;

import com.vw.pizza.entity.Pizza;
import com.vw.pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping("/add")
    public String addPizza( @RequestBody Pizza pizza) {
        return pizzaService.addPizza(pizza);
    }

    @GetMapping("/")
    public List<Pizza> getAllPizzas() {
        return pizzaService.getAllPizzas();
    }

    @GetMapping("/search/{id}")
    public Pizza searchPizza(@PathVariable int id) {
        return pizzaService.searchPizza(id);
    }

    @PutMapping("/{id}")
    public String updatePizza(@PathVariable int id, @RequestBody Pizza pizza) {
        pizza.setId(id);
        return pizzaService.updatePizza(id,pizza);
    }

    @DeleteMapping("/{id}")
    public String deletePizza(@PathVariable int id) {
        return pizzaService.deletePizza(id);
    }
    

    @GetMapping("/veg")
    public List<Pizza> getVegetarianPizzas() {
        return pizzaService.getVegetarianPizzas();
    }

    @GetMapping("/nonveg")
    public List<Pizza> getNonVegetarianPizzas() {
        return pizzaService.getNonVegetarianPizzas();
    }
    
    @GetMapping("/price/below/{price}")
    public List<Pizza> getPizzasByPriceLessThan(@PathVariable double price) {
        return pizzaService.getPizzasByPriceLessThan(price);
    }

    @GetMapping("/price/above/{price}")
    public List<Pizza> getPizzasByPriceGreaterThan(@PathVariable double price) {
        return pizzaService.getPizzasByPriceGreaterThan(price);
    }

    @GetMapping("/size/{size}")
    public List<Pizza> getPizzasBySize(@PathVariable String size) {
        return pizzaService.getPizzasBySize(size);
    }

    @GetMapping("/size/{size}/type/{type}")
    public List<Pizza> getPizzasBySizeAndType(@PathVariable String size, @PathVariable String type) {
        return pizzaService.getPizzasBySizeAndType(size, type);
    }
}

 