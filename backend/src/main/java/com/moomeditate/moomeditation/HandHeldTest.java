package com.moomeditate.moomeditation;

import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;

// Unit test class for Shop
public class ItemTest {
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

// Unit test class for HandHeld
public class HandHeldTest {
    @Test
    public void testImageLoading() {
        // Create a new handheld item with an image path (update with a valid image path)
        HandHeld handheld = new HandHeld("Handheld", 50, true, "path/to/image.jpg");
        assertNotNull(handheld.getImage()); // Verify that the image loaded successfully
    }

    @Test
    public void testCoordinates() {
        HandHeld handheld = new HandHeld("Handheld", 50, true, "path/to/image.jpg");
        assertEquals(300, handheld.getXCoordinate()); // Verify x-coordinate
        assertEquals(500, handheld.getYCoordinate()); // Verify y-coordinate
    }
}

// Unit test class for Hat
public class HatTest {
    @Test
    public void testImageLoading() {
        // Create a new hat item with an image path (update with a valid image path)
        Hat hat = new Hat("Hat", 25, true, "path/to/another/image.jpg");
        assertNotNull(hat.getImage()); // Verify that the image loaded successfully
    }

    @Test
    public void testCoordinates() {
        Hat hat = new Hat("Hat", 25, true, "path/to/another/image.jpg");
        assertEquals(100, hat.getXCoordinate()); // Verify x-coordinate
        assertEquals(200, hat.getYCoordinate()); // Verify y-coordinate
    }
}