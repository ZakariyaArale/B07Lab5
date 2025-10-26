package lab5;

import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTests {

    @Test
    public void defaultConstructor_is1x1Square_trueBranch() {
        Rectangle r = new Rectangle();         
        assertTrue(r.isSquare());             
        assertEquals(1.0, r.area(), 1e-12);
        assertEquals(4.0, r.perimeter(), 1e-12);
    }

    @Test
    public void customRectangle_notSquare_falseBranch() {
        Rectangle r = new Rectangle(3.0, 4.0);
        assertFalse(r.isSquare());             
        assertEquals(12.0, r.area(), 1e-12);
        assertEquals(14.0, r.perimeter(), 1e-12);
    }

    @Test
    public void nearSquare_withinTolerance_countsAsSquare() {
        Rectangle r = new Rectangle(2.0, 2.0 + 5e-10);
        assertTrue("Should count as square within tolerance", r.isSquare());
        assertEquals(4.000000001, r.area(), 1e-9);
        assertEquals(8.000000001, r.perimeter(), 1e-9);
    }
}