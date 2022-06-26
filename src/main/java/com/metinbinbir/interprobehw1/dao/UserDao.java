package com.metinbinbir.interprobehw1.dao;

import com.metinbinbir.interprobehw1.entity.ProductComment;
import com.metinbinbir.interprobehw1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
}
