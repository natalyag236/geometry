package geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.area(), "Area should be 50");
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.perimeter(), "Perimeter should be 30");
    }
}
	