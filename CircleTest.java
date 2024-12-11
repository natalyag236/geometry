package geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CircleTest {

    @Test
    public void testArea() {
        Circle circle = new Circle(5);
        assertEquals(Math.PI * 25, circle.area(), "Area should be π * 25");
    }

    @Test
    public void testPerimeter() {
        Circle circle = new Circle(5);
        assertEquals(2 * Math.PI * 5, circle.perimeter(), "Perimeter should be 2π * 5");
    }
}
