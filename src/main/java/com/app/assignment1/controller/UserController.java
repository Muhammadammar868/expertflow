package com.app.assignment1.controller;


import com.app.assignment1.model.User;
import com.app.assignment1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping(value = "/adduser")
    public void user(@RequestBody User user){
        userService.addUser(user);
        System.out.println("controller " +user);
       // System.out.println(employeModel.getEmploye_name());

    }

    @GetMapping(value = "/getall")
    public List<User> getAll(){
        return userService.getall();

    }

    @DeleteMapping(value = "/del/{id}")
    public void delete(@PathVariable int id){
        userService.deleteuser(id);
        System.out.println(id);
    }

    @PutMapping(value = "/update/{id}")
    public User update(@RequestBody User user, @PathVariable int id){
        return userService.updateuser(user,id);
    }


}
