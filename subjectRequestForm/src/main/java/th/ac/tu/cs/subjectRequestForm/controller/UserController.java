package th.ac.tu.cs.subjectRequestForm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.tu.cs.subjectRequestForm.model.User;
import th.ac.tu.cs.subjectRequestForm.repository.JdbcUserRepository;

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

