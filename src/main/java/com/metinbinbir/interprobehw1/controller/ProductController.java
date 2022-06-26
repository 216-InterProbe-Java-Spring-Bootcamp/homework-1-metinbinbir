package com.metinbinbir.interprobehw1.controller;

import com.metinbinbir.interprobehw1.dao.ProductDao;
import com.metinbinbir.interprobehw1.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class ProductController
{

    private final ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product)
    {
        return productDao.save(product);
    }

    @GetMapping
    public List<Product> findAll()
    {
        return productDao.findAll();
    }
}
