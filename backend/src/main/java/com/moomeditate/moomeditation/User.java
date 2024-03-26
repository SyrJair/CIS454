package com.moomeditate.moomeditation;
import java.util.ArrayList;
import java.util.List;

public class User {
    // Instance variables
    private String username;
    private String password;
    private int currencyAmount; // Assuming currency amount is a decimal value
    private List<Item> items;

    // Constructor
    public User(String username, String password, int currencyAmount) {
        this.username = username;
        this.password = password;
        this.currencyAmount = currencyAmount;
    }
    //Methods
    public int checkCurr(){
        return currencyAmount;
    }
    public void userBuy(Item item){
        currencyAmount = currencyAmount - item.cost;
        items.add(item);
    }
}