package com.moomeditate.moomeditation;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    // List to hold all items in the shop
    private List<Item> items;

    // Constructor to initialize the list of items
    public Shop() {
        items = new ArrayList<>(); // Initialize the list
    }

    // Method to add an item to the shop
    public void addItem(Item item) {
        items.add(item); // Add item to the list
    }

    // Method to get the list of all items
    public List<Item> getItems() {
        return new ArrayList<>(items); // Return a copy of the list
    }

    // Method to remove an item by index
    public boolean removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index); // Remove the item at the specified index
            return true; // Indicate successful removal
        }
        return false; // Indicate failure
    }
}
