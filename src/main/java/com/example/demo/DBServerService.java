package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DBServerService
{
    @Autowired
    DBServerRepository dbServerRepository;

    public DBServerService() {

    }



    public void addUser(User user)
    {
        dbServerRepository.addUser(user);
    }

    public User getUser(int id)
    {
        return dbServerRepository.getUserById(id);
    }

    public HashMap<Integer,User> getAllUsers()
    {
        return dbServerRepository.getUsers();
    }
}
