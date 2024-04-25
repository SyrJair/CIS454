package com.moomeditate.moomeditation;

import java.awt.image.BufferedImage; // For BufferedImage
import javax.imageio.ImageIO; // For reading images
import java.io.File; // For file handling
import java.io.IOException; // For exception handling

public class Hat extends Item {
    // Private fields for the image and location coordinates
    private BufferedImage image; // Image object
    private final int xCoordinate = 100; // Hard-coded x-coordinate for hat
    private final int yCoordinate = 200; // Hard-coded y-coordinate for hat

    // Constructor to initialize the parent class and the image
    public Hat(String itemName, int cost, boolean available, String imagePath) {
        super(itemName, cost, available); // Initialize the parent class

        // Load the image from the specified path
        try {
            this.image = ImageIO.read(new File(imagePath)); // Load image
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage()); // Error handling
            this.image = null; // Set image to null if loading fails
        }
    }

    // Getter for the image
    public BufferedImage getImage() {
        return image;
    }

    public String getItemName(){
        return itemName + " hat";
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
