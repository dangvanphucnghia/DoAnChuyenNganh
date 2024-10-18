package com.example.shopThoiTrangNTS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController  {

    @GetMapping("getAllUser")
    public String getAllUser(){
        return "Hello everyone!!";
    }

    @GetMapping("/getDetail/{id}")
    public String getDetail(@PathVariable("id") int id)
    {
        return "Hello" + id;
    }
}
