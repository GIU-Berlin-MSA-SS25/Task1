package com.scalable.repository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalable.model.Cart;

@Component
public class CartRepository {
    @Value("${spring.application.data_path}")
    private String FILE_PATH;
    private ObjectMapper objectMapper = new ObjectMapper();
    public CartRepository() {
        
    }
    public void addCart(Cart cart) {
         try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                objectMapper.writeValue(new File(FILE_PATH), List.of(cart));
                
            }else{
                List<Cart> carts = Arrays.asList(objectMapper.readValue(file, Cart[].class));
                carts.add(cart);
                objectMapper.writeValue(file, carts);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to JSON file", e);
        }
    }
    public List<Cart> getCarts() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            return Arrays.asList(objectMapper.readValue(file, Cart[].class));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read from JSON file", e);
        }
    }

    
}
