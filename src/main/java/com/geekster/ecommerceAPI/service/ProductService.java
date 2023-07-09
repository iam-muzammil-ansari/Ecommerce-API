package com.geekster.ecommerceAPI.service;

import com.geekster.ecommerceAPI.model.Category;
import com.geekster.ecommerceAPI.model.Product;
import com.geekster.ecommerceAPI.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public String createProduct(Product product) {
        productRepo.save(product);
        return "Product Added Successfully";
    }

    public List<Product> getAllProductsByCategory(Category category) {
        // it's enum but Custom Query we are writing our self so, we will do first to this in string form
        return productRepo.getAllProductsByCategory(category.name());
    }

    public String deleteById(Integer productId) {
        Integer deleteCount = productRepo.removeById(productId);
        if (deleteCount > 0) {
            return "Product, For ID : " + productId + " Successfully Deleted!!";
        }else {
            return "Product, For ID : " + productId + " Not Deleted Bcz this id does not exist in the Table";
        }
    }

}
