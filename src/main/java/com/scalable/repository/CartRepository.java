package com.scalable.repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.scalable.model.Cart;

@Component
public class CartRepository {

    public static List< Cart> carts = new ArrayList<>();

    public CartRepository() {
        carts = new ArrayList<Cart>();
        carts.add(new Cart(1,1,new ArrayList<String>(Arrays.asList("item1","item2"))));
        carts.add(new Cart(2,2,new ArrayList<String>(Arrays.asList("item3","item4"))));
        carts.add(new Cart(3,3,new ArrayList<String>(Arrays.asList("item5","item6"))));
    }
    public void addCart(Cart cart) {
        carts.add(cart);
    }
    
}
