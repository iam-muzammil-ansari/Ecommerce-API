package com.geekster.ecommerceAPI.controller;

import com.geekster.ecommerceAPI.model.Category;
import com.geekster.ecommerceAPI.model.Product;
import com.geekster.ecommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("products")
    public String addProducts(@RequestBody Product product) {
        return productService.createProduct(product);
    }


    //    Task -- 2 -> Get All Products Based on Category //GET // I will get user by Custom Query(CQ)
    @GetMapping("products/productCategory")
    public List<Product> getAllProductsByCategory(@RequestParam Category category) {
        return productService.getAllProductsByCategory(category);
    }

    //    Task -- 3 --> Delete Products By Product_Id // DELETE --> i will use Custom Query(CQ)  used here
    @DeleteMapping("products/productId/{productId}")
    public String deleteById(@PathVariable Integer productId) {
        return productService.deleteById(productId);
    }
}
