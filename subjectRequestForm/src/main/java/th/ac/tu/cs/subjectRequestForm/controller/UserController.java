package com.work.hw1.controller;
import com.work.hw1.model.User;
import com.work.hw1.repository.JdbcUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value={"users"})
public class UserController {
    @Autowired
    private JdbcUserRepository userDao;

    @PostMapping
    public void addUser(@RequestBody User user) {

        userDao.save(user);
        //userDao.saveAddCourses(user);
    } //requestbody ไม่ปรากฎใน url

    @GetMapping
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }



}

