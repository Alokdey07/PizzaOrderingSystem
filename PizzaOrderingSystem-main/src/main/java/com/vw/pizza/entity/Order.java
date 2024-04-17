package com.vw.pizza.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToMany(mappedBy = "orderRecord", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pizza> pizzas = new ArrayList<>();
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "delivery_id") private Delivery delivery;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "restro_id") private Restro restro;
	 */

	public Order(Long id, String status, Customer customer, List<Pizza> pizzas /* Delivery delivery, Restro restro */) {
		super();
		this.id = id;
		this.status = status;
		this.customer = customer;
		this.pizzas = pizzas;
		/*
		 * this.delivery = delivery; this.restro = restro;
		 */
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Pizza> getPizzas() {
		return pizzas;
	}
	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	/*
	 * public Delivery getDelivery() { return delivery; } public void
	 * setDelivery(Delivery delivery) { this.delivery = delivery; } public Restro
	 * getRestro() { return restro; } public void setRestro(Restro restro) {
	 * this.restro = restro; }
	 */
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + "]";
	}
	
    
}
