package com.vw.pizza.service;


import com.vw.pizza.dao.OrderDaoImpl;
import com.vw.pizza.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDaoImpl orderDao;

    public Order getOrderById(Long id) {
        return orderDao.findById(id);
    }

    public List<Order> getAllOrders() {
        return orderDao.findAll();
    }

    public String saveOrder(Order order) {
        return orderDao.save(order);
    }

    public String updateOrder(Order order) {
        return orderDao.update(order);
    }

    public String deleteOrder(Order order) {
        return orderDao.delete(order);
    }
}

