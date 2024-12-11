package geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SphereTest {

    @Test
    public void testVolume() {
        Sphere sphere = new Sphere(5);
        double expectedVolume = (4.0 / 3.0) * Math.PI * Math.pow(5, 3);
        assertEquals(expectedVolume, sphere.volume(), 0.0001, "Volume should be (4/3)πr³");
    }

    @Test
    public void testSurfaceArea() {
        Sphere sphere = new Sphere(5);
        double expectedSurfaceArea = 4 * Math.PI * Math.pow(5, 2);
        assertEquals(expectedSurfaceArea, sphere.surfaceArea(), 0.0001, "Surface area should be 4πr²");
    }
}