package com;

import org.junit.Test;

import com.moomeditate.moomeditation.Item;

import static org.junit.Assert.*;

// Unit test class for Item
public class ItemTest {
    @Test
    public void testItemCreation() {
        Item item = new Item("Test Item", 100, true); // Create an item
        assertEquals("Test Item", item.getItemName()); // Verify item name
        assertEquals(100, item.getCost()); // Verify item cost
        assertTrue(item.isAvailable()); // Verify item availability
    }

    @Test
    public void testBought() {
        Item item = new Item("Test Item", 100, true); // Create an item
        item.bought(); // Mark the item as bought
        assertFalse(item.isAvailable()); // Verify that the item is no longer available
    }
}
