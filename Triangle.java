package geometry;

public class Triangle extends Geometry2D {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor for all three sides
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Constructs a Triangle object with all three sides specified.
     *
     * @param sideA the length of the first side
     * @param sideB the length of the second side
     * @param sideC the length of the third side
     * @throws IllegalArgumentException if the sides do not form a valid triangle
     */
     public Triangle(double base, double height) {
        this.sideA = base;
        this.sideB = height;
        this.sideC = Math.sqrt(base * base + height * height); 
    }
     /**
     * Calculates and returns the area of the triangle.
     * Uses Heron's formula for general triangles and the standard formula for right triangles.
     *
     * @return the area of the triangle
     */
    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    /**
     * Calculates and returns the perimeter of the triangle.
     * The perimeter is the sum of all three sides.
     *
     * @return the perimeter of the triangle
     */

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    
   


    
}
