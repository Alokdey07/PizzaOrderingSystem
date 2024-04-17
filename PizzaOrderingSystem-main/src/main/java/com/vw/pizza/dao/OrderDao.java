package com.vw.pizza.dao;

import java.util.List;

import com.vw.pizza.entity.Order;

public interface OrderDao {
    public Order findById(Long id);
    public List<Order> findAll();
    public String save(Order order);
    public String update(Order order);
    public String delete(Order order);
}

