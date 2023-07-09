package com.geekster.ecommerceAPI.repository;

import com.geekster.ecommerceAPI.model.Category;
import com.geekster.ecommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "select * from Product where Product_Category = :category",nativeQuery = true)
    List<Product> getAllProductsByCategory(String category);

    @Modifying
    @Query(value = "delete from Product where product_id = :productId", nativeQuery = true)
    Integer removeById(Integer productId);
}
