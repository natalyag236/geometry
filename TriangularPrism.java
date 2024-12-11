package geometry;


public class TriangularPrism extends Geometry3D {
    private final double baseArea;
    private final double basePerimeter;
    private final double height;

    /**
     * Constructs a TriangularPrism with the specified base area, base perimeter, and height.
     * 
     * @param baseArea The area of the triangular base of the prism.
     * @param basePerimeter The perimeter of the triangular base of the prism.
     * @param height The height of the triangular prism.
     */
    public TriangularPrism(double baseArea, double basePerimeter, double height) {
        this.baseArea = baseArea;
        this.basePerimeter = basePerimeter;
        this.height = height;
    }

    /**
     * Calculates the volume of the triangular prism.
     * The volume is the product of the base area and the height of the prism.
     * 
     * @return The volume of the triangular prism.
     */
    @Override
    public double volume() {
        return baseArea * height;
    }

    /**
     * Calculates the surface area of the triangular prism.
     * The surface area is calculated as the sum of the area of two triangular bases and the area of the three rectangular sides.
     * 
     * @return The surface area of the triangular prism.
     */
    @Override
    public double surfaceArea() {
        return 2 * baseArea + basePerimeter * height;
    }
}
