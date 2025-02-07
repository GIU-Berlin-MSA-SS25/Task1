package com.scalable.controller;

import com.scalable.model.Cart;
import com.scalable.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController

public class Controller {

    @Autowired
    public CartService cartService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to cart!";
    }
    @PostMapping("/addCart")
    public String addCart(@RequestBody Map<String, Object> payload) {
        int id = (int) payload.get("id");
        int userId = (int) payload.get("userId");
        ArrayList<String> items = (ArrayList<String>) payload.get("items");
        Cart cart = new Cart(id, userId, items);
        cartService.addCart(cart);
        return "Cart added successfully!";
    }
    @GetMapping("/getCarts")
    public List<Cart> getCarts() {
        return cartService.getCarts();
    }
    

}
