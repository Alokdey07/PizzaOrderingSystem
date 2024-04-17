package com.vw.pizza.controller;

import com.vw.pizza.dao.OrderDaoImpl;
import com.vw.pizza.entity.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderDaoImpl orderDao;

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        Order order = orderDao.findById(id);
        if (order != null) {
            return ResponseEntity.ok(order);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderDao.findAll();
        return ResponseEntity.ok(orders);
    }

    @PostMapping
    public ResponseEntity<String> saveOrder(@RequestBody Order order) {
        String response = orderDao.save(order);
        return ResponseEntity.ok(response);
    }

    @PutMapping
    public ResponseEntity<String> updateOrder(@RequestBody Order order) {
        String response = orderDao.update(order);
        if (response.equals("Order updated successfully")) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<String> deleteOrder(@RequestBody Order order) {
        String response = orderDao.delete(order);
        if (response.equals("Order deleted successfully")) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

