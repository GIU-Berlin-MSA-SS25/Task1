package com.scalable.services;

import com.scalable.model.Cart;
import com.scalable.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CartService {
    @Autowired
    public CartRepository cartRepository;

    public CartService() {
      
    }

    public void addCart(Cart cart) {
        cartRepository.addCart(cart);
    }
    public ArrayList<Cart> getCarts() {
        return new ArrayList<>(cartRepository.getCarts());
    }

   

}
