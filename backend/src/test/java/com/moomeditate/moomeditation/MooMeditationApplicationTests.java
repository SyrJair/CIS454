package com.moomeditate.moomeditation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

// README
// Unit testing below
// This testing file is a work in progress!

// Extend with SpringExtension to integrate Spring TestContext Framework into JUnit 5's Jupiter programming model.
@ExtendWith(SpringExtension.class)
@SpringBootTest
class MooMeditationApplicationTests {

	@Autowired
	private MeditationService meditationService; // this is assuming this is the service created (not the case for us)

	// This test checks if the Spring context loads properly.
	@Test
	void contextLoads() {
		// Context loads if no exceptions are thrown.
	}

	// Before each test, we can set up any common requirements for the tests.
	@BeforeEach
	void setUp() {
		// Common setup code, like initializing mock data or configurations
	}

	// This test checks if the MeditationService is not null, implying that it has been autowired correctly.
	@Test
	void whenAutowired_thenMeditationServiceShouldNotBeNull() {
		assertThat(meditationService).isNotNull();
	}

	// such as retrieving the total minutes meditated by the user
	@Test
	void whenAskedForTotalMeditationMinutes_thenShouldReturnCorrectSum() {
		// Setup test data if necessary
		// ...

		// Call the method on the service
		int totalMinutes = meditationService.getTotalMeditationMinutes();

		// Assert that the method returns the expected value
		assertThat(totalMinutes).isEqualTo(123); // Replace 123 with number of minutes meditated by user
	}

	// Add more test cases below
}

