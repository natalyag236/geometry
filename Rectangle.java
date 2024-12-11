package geometry;

public class Rectangle extends Geometry2D {
	private double width;
    private double height;
    /**
     * Constructs a Rectangle object with the specified width and height.
     *
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     * @throws IllegalArgumentException if the width or height is negative
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /**
     * Calculates and returns the area of the rectangle.
     * The formula for the area is  width * height}.
     *
     * @return the area of the rectangle
     */
    @Override
    public double area() {
        return width * height;
    }
    /**
     * Calculates and returns the perimeter of the rectangle.
     * The formula for the perimeter is  2 * (width + height).
     *
     * @return the perimeter of the rectangle
     */
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}