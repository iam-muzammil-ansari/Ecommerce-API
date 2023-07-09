package com.geekster.ecommerceAPI.controller;

import com.geekster.ecommerceAPI.model.Order;
import com.geekster.ecommerceAPI.service.OrderService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    //    Task -- 1 -- Create Order --> Crud Repository (CR) method
    @PostMapping("orders")
    public String createOrders(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    //    Task -- 2 -> Get Order by Order_id //GET // I will get by Custom Query
    @GetMapping("orders/orderId/{orderId}")
    public Order getOrderById(@PathVariable Integer orderId) {
        return orderService.getOrderById(orderId);
    }
}
