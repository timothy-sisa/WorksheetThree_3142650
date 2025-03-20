package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * * Name: TIMOTHY SISA
 * Student Number: 3142650
 * Test class for RightAngledTriangle.
 */
public class RightAngledTriangleTest {

    @Test
    public void testAreaCalculation() {
        RightAngledTriangle triangle = new RightAngledTriangle("TestTriangle", 3.0, 4.0, 5.0);
        assertEquals(6.0, triangle.area(), 0.0001);
    }

    @Test
    public void testPerimeterCalculation() {
        RightAngledTriangle triangle = new RightAngledTriangle("TestTriangle", 3.0, 4.0, 5.0);
        assertEquals(12.0, triangle.perimeter(), 0.0001);
    }

    @Test
    public void testToString() {
        RightAngledTriangle triangle = new RightAngledTriangle("TestTriangle", 3.0, 4.0, 5.0);
        String expected = "Shape name: TestTriangle, Base: 3.0, Height: 4.0, Hypotenuse: 5.0";
        assertEquals(expected, triangle.toString());
    }
}

