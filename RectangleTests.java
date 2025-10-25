package lab5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * JUnit Test Suit for testing Rectangle.java
 * 
 * @author Ben Heerema.
 * @version 17.0.12.
 * @since 24 - Oct. - 2025.
 * @see Rectangle
 */
class RectangleTests {
	
	//TO DO: Ayden should add tests the deal with doubles as length and width are doubles. 
	//			Feel free to add any other tests you can think of as well. :)
	

	@Test
	void testNoArgsConstructor_Null() {
		Rectangle r = new Rectangle();
		assertNotNull(r);
	}

	@Test
	void testNoArgsContructor_defualtValues() {
		Rectangle r = new Rectangle();
		assertEquals(r.length, 1);
		assertEquals(r.width, 1);
	}
	
	@Test
	void testConstructor_Null() {
		Rectangle r = new Rectangle(4, 5);
		assertNotNull(r);
	}
	
	@Test
	void testContructor_positive_values() {
		Rectangle r = new Rectangle(4, 5);
		assertEquals(r.length, 4);
		assertEquals(r.width, 5);
	}
	
	@Test
	void testContructor_negative_length() {
		Rectangle r = new Rectangle(-4, 5);
		assertNotNull(r);
		assertEquals(r.length, 4);
		assertEquals(r.width, 5);
	}
	
	@Test
	void testContructor_negative_width() {
		Rectangle r = new Rectangle(4, -5);
		assertNotNull(r);
		assertEquals(r.length, 4);
		assertEquals(r.width, 5);
	}
	
	@Test
	void testContructor_negative_values() {
		Rectangle r = new Rectangle(-4, -5);
		assertNotNull(r);
		assertEquals(r.length, 4);
		assertEquals(r.width, 5);
	}
	
	@Test
	void testContructor_0_length() {
		Rectangle r = new Rectangle(0, -5);
		assertNotNull(r);
		assertEquals(r.length, 0);
		assertEquals(r.width, 5);
	}
	
	@Test
	void testContructor_0_width() {
		Rectangle r = new Rectangle(4, 0);
		assertNotNull(r);
		assertEquals(r.length, 4);
		assertEquals(r.width, 0);
	}
	
	@Test
	void testPerimeter_Simple_Values() {
		Rectangle r = new Rectangle(4, 5);
		assertEquals(r.perimeter(), 18);
	}
	
	@Test
	void testPerimeter_0_Length() {
		Rectangle r = new Rectangle(0, 5);
		assertEquals(r.perimeter(), 10);
	}
	
	@Test
	void testPerimeter_0_Width() {
		Rectangle r = new Rectangle(4, 0);
		assertEquals(r.perimeter(), 8);
	}
	
	@Test
	void testPerimeter_0_Values() {
		Rectangle r = new Rectangle(0, 0);
		assertEquals(r.perimeter(), 0);
	}
	
	@Test
	void testArea_Simple_Values() {
		Rectangle r = new Rectangle(4, 5);
		assertEquals(r.area(), 20);
	}
	
	@Test
	void testArea_0_Length() {
		Rectangle r = new Rectangle(0, 5);
		assertEquals(r.area(), 0);
	}
	
	@Test
	void testArea_0_Width() {
		Rectangle r = new Rectangle(4, 0);
		assertEquals(r.area(), 0);
	}
	
	@Test
	void testArea_0_Values() {
		Rectangle r = new Rectangle(0, 0);
		assertEquals(r.area(), 0);
	}
	
	@Test
	void testIsSquare_Simple_Square() {
		Rectangle r = new Rectangle(1, 1);
		assertTrue(r.isSquare());
	}
	
	@Test
	void testIsSquare_Not_square() {
		Rectangle r = new Rectangle(4, 5);
		assertFalse(r.isSquare());
	}
	
	@Test
	void testIsSquare_Not_Square_with_close_Values() {
		Rectangle r = new Rectangle(1.00002, 1);
		assertFalse(r.isSquare());
	}
	
	
}
