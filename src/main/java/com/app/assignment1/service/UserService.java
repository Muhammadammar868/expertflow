package com.app.assignment1.service;


import com.app.assignment1.model.User;
import com.app.assignment1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;

    public void addUser(User user) {
        System.out.println("service " + user);

        userRepo.save(user);


    }

    public List<User> getall() {

        List<User> list = new ArrayList<>();
        userRepo.findAll().forEach(list::add);
        return list;
    }

    public void deleteuser(int id) {

        userRepo.deleteAllById(Collections.singleton(id));
    }

    public User updateuser(User user, int id) {

        return userRepo.save(user);
    }
}
