package com.geekster.ecommerceAPI.service;

import com.geekster.ecommerceAPI.model.Order;
import com.geekster.ecommerceAPI.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public Order getOrderById(Integer id) {
        return orderRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Order not found"));
    }

    public String createOrder(Order order) {
        orderRepo.save(order);
        return "Order Added Successfully!!!!";
    }

}
