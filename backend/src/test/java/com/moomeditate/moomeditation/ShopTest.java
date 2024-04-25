package com.moomeditate.moomeditation;

import org.junit.Test;

import com.moomeditate.moomeditation.Item;
import com.moomeditate.moomeditation.Shop;

import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;

// Unit test class for Shop
public class ShopTest {
    private Shop shop;

    @Before
    public void setUp() {
        shop = new Shop(); // Initialize a new Shop before each test
    }

    @Test
    public void testAddItem() {
        Item item = new Item("Test Item", 10, true);
        shop.addItem(item); // Add an item to the shop
        List<Item> items = shop.getItems(); // Retrieve items from the shop
        assertEquals(1, items.size()); // Verify there's one item in the shop
        assertEquals("Test Item", items.get(0).getItemName()); // Verify the item's name
    }

    @Test
    public void testGetItems() {
        Item item1 = new Item("Item1", 20, true);
        Item item2 = new Item("Item2", 30, true);
        shop.addItem(item1); // Add the first item
        shop.addItem(item2); // Add the second item
        List<Item> items = shop.getItems(); // Get all items from the shop
        assertEquals(2, items.size()); // Verify there are two items
    }

    @Test
    public void testRemoveItem() {
        Item item1 = new Item("Item1", 20, true);
        shop.addItem(item1); // Add an item to the shop
        assertTrue(shop.removeItem(0)); // Remove the item by index
        List<Item> items = shop.getItems(); // Retrieve items from the shop
        assertEquals(0, items.size()); // Verify the shop is empty
    }

    @Test
    public void testRemoveInvalidIndex() {
        assertFalse(shop.removeItem(-1)); // Try to remove an item with invalid index
        assertFalse(shop.removeItem(1)); // Try to remove an item with another invalid index
    }
}