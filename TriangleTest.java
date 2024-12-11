package geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        double s = (3 + 4 + 5) / 2.0;
        double expectedArea = Math.sqrt(s * (s - 3) * (s - 4) * (s - 5));
        assertEquals(expectedArea, triangle.area(), 0.0001, "Area should be calculated using Heron's formula");
    }

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        double expectedPerimeter = 3 + 4 + 5;
        assertEquals(expectedPerimeter, triangle.perimeter(), "Perimeter should be the sum of the sides");
    }
}