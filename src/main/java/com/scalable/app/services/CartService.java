package com.scalable.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalable.app.model.Cart;
import com.scalable.app.repository.CartRepository;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;


    public CartService() {
        
    }

    public Cart addCart(Cart cart) {
        return cartRepository.addCart(cart);
    }
    public ArrayList<Cart> getCarts() {
        return cartRepository.getCarts();
    }

   

}
