package com.vw.pizza.dao;



import com.vw.pizza.entity.Order;
import com.vw.pizza.repo.OrderRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order findById(Long id) {
        return orderRepo.findById(id).orElse(null);
    }

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public String save(Order order) {
        orderRepo.save(order);
        return "Order saved successfully";
    }

    @Override
    public String update(Order order) {
        if (orderRepo.existsById(order.getId())) {
            orderRepo.save(order);
            return "Order updated successfully";
        } else {
            return "Order not found";
        }
    }

    @Override
    public String delete(Order order) {
        if (orderRepo.existsById(order.getId())) {
            orderRepo.delete(order);
            return "Order deleted successfully";
        } else {
            return "Order not found";
        }
    }
}

