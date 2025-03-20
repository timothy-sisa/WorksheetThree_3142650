package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *  * Name: TIMOTHY SISA
 * Student Number: 3142650
 * Test class for Rhombus.
 */
public class RhombusTest {

    @Test
    public void testAreaCalculation() {
        Rhombus rhombus = new Rhombus("TestRhombus", 6.0, 8.0, 5.0);
        assertEquals(24.0, rhombus.area(), 0.0001);
    }

    @Test
    public void testPerimeterCalculation() {
        Rhombus rhombus = new Rhombus("TestRhombus", 6.0, 8.0, 5.0);
        assertEquals(20.0, rhombus.perimeter(), 0.0001);
    }

    @Test
    public void testToString() {
        Rhombus rhombus = new Rhombus("TestRhombus", 6.0, 8.0, 5.0);
        String expected = "Shape name: TestRhombus, Diagonals: 6.0, 8.0, Side: 5.0";
        assertEquals(expected, rhombus.toString());
    }
}
