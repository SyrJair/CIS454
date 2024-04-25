package com.moomeditate.moomeditation;

import org.junit.Test;

import com.moomeditate.moomeditation.Hat;

import static org.junit.Assert.*;

// Unit test class for Hat
public class HatTest {

    @Test
    public void testCoordinates() {
        Hat hat = new Hat("Hat", 25, true, "path/to/another/image.jpg");
        assertEquals(100, hat.getXCoordinate()); // Verify x-coordinate
        assertEquals(200, hat.getYCoordinate()); // Verify y-coordinate
    }
}
