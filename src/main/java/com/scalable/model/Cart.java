package com.scalable.model;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class Cart {

    public int id;
    public int userId;
    public ArrayList<String> items;


    public Cart() {
        
    }
    public Cart(int id,int userId,ArrayList<String> items) {
        this.id = id;
        this.userId = userId;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
    public void addItem(String item) {
        this.items.add(item);
    }
    public void removeItem(String item) {
        this.items.remove(item);
    }
    public String toString(){
        return "Cart id: "+this.id+" User id: "+this.userId+" Items: "+this.items;
    }
}
