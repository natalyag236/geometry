package geometry;

public class Sphere extends Geometry3D {
    private final double radius;
    /**
     * Constructs a  Sphere object with the specified radius.
     *
     * @param radius the radius of the sphere
     * @throws IllegalArgumentException if the radius is negative
     */
    public Sphere(double radius) {
        this.radius = radius;
    }
    /**
     * Calculates and returns the volume of the sphere.
     * 
     *
     * @return the volume of the sphere
     */
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    /**
     * Calculates and returns the surface area of the sphere.
     * 
     *
     * @return the surface area of the sphere
     */
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
	

}