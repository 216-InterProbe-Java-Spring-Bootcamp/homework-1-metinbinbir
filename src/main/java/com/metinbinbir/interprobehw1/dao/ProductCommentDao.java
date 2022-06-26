package com.metinbinbir.interprobehw1.dao;

import com.metinbinbir.interprobehw1.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductCommentDao extends JpaRepository<ProductComment, Long>
{
    // Question 2
    List<ProductComment> findProductCommentsByProductId(Long id);

    // Question 3
    List<ProductComment> findProductCommentsByProductIdAndCommentDateBetween(Long id, Date firstDate, Date secondDate);

    // Question 4
    List<ProductComment> findProductCommentsByUserId(Long id);

    // Question 5
    List<ProductComment> findProductCommentsByUserIdAndCommentDateBetween(Long id, Date firstDate, Date secondDate);
}

