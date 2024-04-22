package com.moomeditate.moomeditation;

public class Item{
    public String itemName;
    public int cost;
    public boolean available;
    public Item(String itemName, int cost, boolean available) {
        this.itemName = itemName;
        this.cost = cost;
        this.available = available;
    }

    // Getter for itemName
    public String getItemName() {
        return itemName;
    }

    // Setter for itemName
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter for cost
    public int getCost() {
        return cost;
    }

    // Setter for cost
    public void setCost(int cost) {
        this.cost = cost;
    }

    // Getter for available
    public boolean isAvailable() {
        return available;
    }

    // Setter for available
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to mark the item as bought, making it unavailable
    public void bought() {
        this.available = false;
    }
}