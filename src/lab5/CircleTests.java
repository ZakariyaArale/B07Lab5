package lab5;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTests {

    @Test
    public void defaultConstructor_isUnitCircle_trueBranch() {
        Circle c = new Circle();
        assertTrue(c.isUnitCircle());
        assertEquals(Math.PI * 1.0, c.Area(), 1e-12);
        assertEquals(2 * Math.PI * 1.0, c.Perimeter(), 1e-12);
    }

    @Test
    public void negativeRadius_absApplied_and_isUnitCircle_falseBranch() {
        Circle c = new Circle(-3.0);
        assertFalse(c.isUnitCircle());
        assertEquals(Math.PI * 9.0, c.Area(), 1e-12);
        assertEquals(2 * Math.PI * 3.0, c.Perimeter(), 1e-12);
    }

    @Test
    public void zeroRadius_areaAndPerimeterZero() {
        Circle c = new Circle(0.0);
        assertFalse(c.isUnitCircle());
        assertEquals(0.0, c.Area(), 1e-12);
        assertEquals(0.0, c.Perimeter(), 1e-12);
    }
}