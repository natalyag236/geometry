package geometry;

public class Circle extends Geometry2D {
	
    private final double radius;
    /**
     * Constructs a  Circle object with the specified radius.
     *
     * @param radius the radius of the circle
     * @throws IllegalArgumentException if the radius is negative
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    /**
     * Calculates and returns the area of the circle.
     * The formula for the area of a circle is π * radius^2.
     *
     * @return the area of the circle
     */
    public double area() {
        return Math.PI * radius * radius;
    }
    /**
     * Calculates and returns the perimeter (circumference) of the circle.
     * The formula for the perimeter of a circle is 2 * π * radius.
     *
     * @return the perimeter of the circle
     */

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
   

}