package griffith;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration test for Shape subclasses.
 */
public class IntergrationTest {

    @Test
    public void testShapesCollection() {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle1", 3.5));
        shapes.add(new Circle("Circle2", 2.0));
        shapes.add(new Rhombus("Rhombus1", 5.0, 6.0, 4.0));
        shapes.add(new Rhombus("Rhombus2", 8.0, 10.0, 6.0));
        shapes.add(new RightAngledTriangle("Triangle1", 3.0, 4.0, 5.0));
        shapes.add(new RightAngledTriangle("Triangle2", 6.0, 8.0, 10.0));

        for (Shape shape : shapes) {
            assertTrue(shape.area() > 0);
            assertTrue(shape.perimeter() > 0);
        }
    }
}

