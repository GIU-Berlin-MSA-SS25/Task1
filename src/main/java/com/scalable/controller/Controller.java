package com.scalable.controller;

import com.scalable.model.Cart;
import com.scalable.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController

public class Controller {

    @Autowired
    public CartService cartService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to cart!";
    }
    

}
