package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
    void area_isPiR2_forPositiveRadius() {
        Circle circle = new Circle(3.0);
        double area = circle.Area();
        assertEquals(Math.PI * 9.0, area, 1e-9);
    }
	
	@Test
	void area_of_unitCircle() {
		Circle circle = new Circle();
		double area = circle.Area();
		assertEquals(Math.PI, area, 1e-9);
	}

    @Test
    void circumference_is2PiR() {
        Circle circle = new Circle(2.5);
        assertEquals(2 * Math.PI * 2.5, circle.Perimeter(), 1e-9);
    }
    
    @Test
    void is_unitCircle() {
    	Circle circle = new Circle();
    	assertTrue(circle.isUnitCircle());
    }
    
    @Test
    void its_not_unitCircle() {
    	Circle circle = new Circle(2.1);
    	assertFalse(circle.isUnitCircle());
    }

}
