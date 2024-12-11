package geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangularPrismTest {

    @Test
    public void testVolume() {
        TriangularPrism prism = new TriangularPrism(10, 12, 5);
        double expectedVolume = 10 * 5; // baseArea * height
        assertEquals(expectedVolume, prism.volume(), 0.0001, "Volume should be baseArea * height");
    }

    @Test
    public void testSurfaceArea() {
        TriangularPrism prism = new TriangularPrism(10, 12, 5);
        double expectedSurfaceArea = 2 * 10 + 12 * 5; // 2 * baseArea + basePerimeter * height
        assertEquals(expectedSurfaceArea, prism.surfaceArea(), 0.0001, "Surface area should be 2 * baseArea + basePerimeter * height");
    }
}