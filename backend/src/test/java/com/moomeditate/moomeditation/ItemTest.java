package com.moomeditate.moomeditation;

import org.junit.Before;
import org.junit.Test;

import com.moomeditate.moomeditation.Item;
import com.moomeditate.moomeditation.User;

import static org.junit.Assert.*;

// Unit test class for Item
// README
// This is unit testing for the shop page

public class ItemTest {
    private User user;

    @Before
    public void setUp() {
        user = new User(); // Initialize a new user for each test
    }

    @Test
    public void testItemCreation() {
        Item item = new Item("Test Item X", 100, true); // Create an item
        assertEquals("Test Item X", item.getItemName()); // Verify item name
        assertEquals(100, item.getCost()); // Verify item cost
        assertTrue(item.isAvailable()); // Verify item availability
    }

    @Test
    public void testBought() {
        Item item = new Item("Test Item Purchased", 100, true); // Create an item
        item.bought(); // Mark the item as bought
        assertFalse(item.isAvailable()); // Verify that the item is no longer available
    }

    @Test
    public void testInsufficientBalance() {
        Item testItem = new Item("test item", 101, true); // Test item
        user.addToCart(expensiveItem); // Add expensive item to the user's cart
        user.setBalance(100); // Set user's balance to be less than the item's cost
        String result = user.purchaseItems(); // Attempt to purchase item
        assertEquals("Insufficient balance!", result); // Error message displayed to user
        assertTrue(testItem.isAvailable()); // Item still in shop
    }

    @Test
    public void testEmptyCartPurchase() {
        user.setBalance(500); // assuming user has 500 MB balance
        String result = user.purchaseItems(); // Attempt to purchase with an empty cart
        assertEquals("Cart is empty!", result); // Verify the empty cart message
    }
}
