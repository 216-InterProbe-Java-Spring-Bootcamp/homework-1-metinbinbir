package com.metinbinbir.interprobehw1.controller;

import com.metinbinbir.interprobehw1.dao.ProductDao;
import com.metinbinbir.interprobehw1.dao.UserDao;
import com.metinbinbir.interprobehw1.entity.Product;
import com.metinbinbir.interprobehw1.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserDao userDao;


}
