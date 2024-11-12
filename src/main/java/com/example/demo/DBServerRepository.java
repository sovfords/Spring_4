package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DBServerRepository
{
    HashMap<Integer,User> users;

    public DBServerRepository(HashMap<Integer, User> users) {
        this.users = users;
        users.put(1,new User(1,"Sovfor","Fedotov"));
        users.put(2,new User(2,"Kate","Lonsun"));
    }

    public HashMap<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Integer, User> users) {
        this.users = users;
    }

    public User getUserById(int id)
    {
        return users.get(id);
    }

    public void addUser(User user)
    {
        users.put(user.getId(),user);
    }
}
