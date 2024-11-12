package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.stream.Stream;

@Controller
@RequestMapping("/users")
public class dbServerController
{
    @Autowired
    DBServerService dbServerService;
    @GetMapping
    public String welcome()
    {
        return "welcome";
    }
    @GetMapping("/name")
    public String Hello(Model model)
    {
        model.addAttribute("name","Sovfor");
        return "Name";
    }

    @GetMapping("/printAll")
    public String printAll(Model model)
    {

        model.addAttribute("users",dbServerService.getAllUsers());

        return "allUsers";
    }
    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id,Model model)
    {

        model.addAttribute("id",id);
        model.addAttribute("user",dbServerService.getUser(id));
        return "userById";
    }

}
