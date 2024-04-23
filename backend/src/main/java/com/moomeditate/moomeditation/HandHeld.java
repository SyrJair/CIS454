package com.moomeditate.moomeditation;

import java.awt.image.BufferedImage; // Import for BufferedImage
import javax.imageio.ImageIO; // Import for reading images
import java.io.File; // For file handling
import java.io.IOException; // For exception handling

public class HandHeld extends Item {
    // Private fields for the image and location coordinates
    private BufferedImage image; // Image object
    private final int xCoordinate = 300; // Hard-coded x-coordinate for handheld item
    private final int yCoordinate = 500; // Hard-coded y-coordinate for handheld item

    // Constructor to initialize the parent class and the image
    public HandHeld(String itemName, int cost, boolean available, String imagePath) {
        // Initialize the parent class with item name, cost, and availability
        super(itemName, cost, available);

        // Load the image from the specified path
        try {
            this.image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
            this.image = null; // Fallback to null if the image couldn't be loaded
        }
    }

    // Getter for image
    public BufferedImage getImage() {
        return image;
    }

    // Getter for xCoordinate
    public int getXCoordinate() {
        return xCoordinate;
    }

    // Getter for yCoordinate
    public int getYCoordinate() {
        return yCoordinate;
    }
}