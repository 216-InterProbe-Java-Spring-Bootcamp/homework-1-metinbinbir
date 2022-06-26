package com.metinbinbir.interprobehw1.controller;

import com.metinbinbir.interprobehw1.dao.ProductCommentDao;
import com.metinbinbir.interprobehw1.dao.ProductDao;
import com.metinbinbir.interprobehw1.entity.Product;
import com.metinbinbir.interprobehw1.entity.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("productComments")
public class ProductCommentController {

    private final ProductCommentDao productCommentDao;

    @PostMapping
    public ProductComment save(@RequestBody ProductComment productComment)
    {
        return productCommentDao.save(productComment);
    }

    @GetMapping
    public List<ProductComment> findAll()
    {
        return productCommentDao.findAll();
    }
}
