package geometry;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        GeometryLinkedList storage = new GeometryLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: add, remove, find, list, or exit");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("exit")) {
                break;
            }

            switch (option.toLowerCase()) {
                case "add":
                    System.out.println("Choose type: 2D or 3D");
                    String type = scanner.nextLine();
                    if (type.equalsIgnoreCase("2D")) {
                        System.out.println("Choose shape: rectangle, circle, triangle");
                        String shape = scanner.nextLine();
                        switch (shape.toLowerCase()) {
                            case "rectangle":
                                System.out.println("Enter width and height:");
                                double width = scanner.nextDouble();
                                double height = scanner.nextDouble();
                                storage.addGeometry(new Rectangle(width, height));
                                break;
                            case "circle":
                                System.out.println("Enter radius:");
                                double radius = scanner.nextDouble();
                                storage.addGeometry(new Circle(radius));
                                break;
                            case "triangle":
                                System.out.println("Enter sides a, b, and c:");
                                double sideA = scanner.nextDouble();
                                double sideB = scanner.nextDouble();
                                double sideC = scanner.nextDouble();
                                storage.addGeometry(new Triangle(sideA, sideB, sideC));
                                break;
                        }
                    } else if (type.equalsIgnoreCase("3D")) {
                        System.out.println("Choose shape: sphere, triangularprism");
                        String shape = scanner.nextLine();
                        switch (shape.toLowerCase()) {
                            case "sphere":
                                System.out.println("Enter radius:");
                                double radius = scanner.nextDouble();
                                storage.addGeometry(new Sphere(radius));
                                break;
                            case "triangularprism":
                                System.out.println("Enter base area, base perimeter, and height:");
                                double baseArea = scanner.nextDouble();
                                double basePerimeter = scanner.nextDouble();
                                double height = scanner.nextDouble();
                                storage.addGeometry(new TriangularPrism(baseArea, basePerimeter, height));
                                break;
                        }
                    }
                    scanner.nextLine(); // consume the newline
                    break;
                case "remove":
                    System.out.println("Choose type: 2D or 3D");
                    type = scanner.nextLine();
                    System.out.println("Enter index:");
                    int index = scanner.nextInt();
                    if (type.equalsIgnoreCase("2D")) {
                        storage.removeGeometry(storage.findGeometry2D(index));
                    } else if (type.equalsIgnoreCase("3D")) {
                        storage.removeGeometry(storage.findGeometry3D(index));
                    }
                    scanner.nextLine(); // consume the newline
                    break;
                case "find":
                    System.out.println("Choose type: 2D or 3D");
                    type = scanner.nextLine();
                    System.out.println("Enter index:");
                    index = scanner.nextInt();
                    if (type.equalsIgnoreCase("2D")) {
                        Geometry2D geometry2D = storage.findGeometry2D(index);
                        System.out.println("Area: " + geometry2D.area() + ", Perimeter: " + geometry2D.perimeter());
                    } else if (type.equalsIgnoreCase("3D")) {
                        Geometry3D geometry3D = storage.findGeometry3D(index);
                        System.out.println("Volume: " + geometry3D.volume() + ", Surface Area: " + geometry3D.surfaceArea());
                    }
                    scanner.nextLine(); // consume the newline
                    break;
                case "list":
                    System.out.println("2D Geometries:");
                    for (int i = 0; i < storage.getGeometries2D().size(); i++) {
                        Geometry2D geometry2D = storage.getGeometries2D().get(i);
                        System.out.println(i + ": Area: " + geometry2D.area() + ", Perimeter: " + geometry2D.perimeter());
                    }
                    System.out.println("3D Geometries:");
                    for (int i = 0; i < storage.getGeometries3D().size(); i++) {
                        Geometry3D geometry3D = storage.getGeometries3D().get(i);
                        System.out.println(i + ": Volume: " + geometry3D.volume() + ", Surface Area: " + geometry3D.surfaceArea());
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

        scanner.close();
    }
}