package com.vw.pizza.dao;

import com.vw.entity.Order;
import java.util.List;

public interface OrderDao {
    public Order findById(Long id);
    public List<Order> findAll();
    public String save(Order order);
    public String update(Order order);
    public String delete(Order order);
}

