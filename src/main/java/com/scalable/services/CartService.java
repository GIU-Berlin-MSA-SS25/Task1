package com.scalable.services;

import com.scalable.components.Cart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CartService {
    public static ArrayList<Cart> carts ;


    public CartService() {
        carts = new ArrayList<Cart>();
        carts.add(new Cart(1,1,new ArrayList<String>(Arrays.asList("item1","item2"))));
        carts.add(new Cart(2,2,new ArrayList<String>(Arrays.asList("item3","item4"))));
        carts.add(new Cart(3,3,new ArrayList<String>(Arrays.asList("item5","item6"))));
    }

    public void addCart(Cart cart) {
        carts.add(cart);
    }

   

}
