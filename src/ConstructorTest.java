import static org.junit.Assert.*;

import org.junit.Test;

/**
 * To make these tests pass, you will need to fill out the Student class with the constructor,
 * getters, and setters. If they're done right, these tests will pass.
 * 
 * **/

public class ConstructorTest {

	class Student {
		private String name;
		private double heightInches;
		private int eyes;
		private String temp;
		private int programmingLevel;

		// Fill in the code for the constructor, getters, and setters

	}
	
	@Test
	public void testConstructor() {
		Student alex = new Student("Alex", 62.5, 2, "");
		assertEquals("Alex", alex.getName());
		assertEquals(2, alex.getEyes());
		assertEquals(62.5, alex.getHeight(), 0.1);

		Student john = new Student("John", 66.138, 2, "");
		assertEquals("John", john.getName());
		assertEquals(2, john.getEyes());
		assertEquals(66.138, john.getHeight(), 0.1);
	}

	@Test
	public void testSetters() {
		Student stuart = new Student("Stuart", 13.01, 3, "");

		stuart.setProgrammingLevel(1);
		assertEquals(1, stuart.getProgrammingLevel());

		stuart.setProgrammingLevel(6);
		assertEquals(6, stuart.getProgrammingLevel());
	}

}



