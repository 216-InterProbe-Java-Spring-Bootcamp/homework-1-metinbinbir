package com.metinbinbir.interprobehw1.dao;

import com.metinbinbir.interprobehw1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.beans.Customizer;
import java.util.Date;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long>{

    // Question 6
    @Query("SELECT product from Product product where product.expirationDate < CURRENT_DATE")
    List<Product> findAllNotExpiredProducts();

    // Question 7
    @Query("SELECT product from Product product where product.expirationDate > CURRENT_DATE or product.expirationDate is NULL")
    List<Product> findAllExpiredProducts();

}
