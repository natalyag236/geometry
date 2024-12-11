package geometry;


import java.util.LinkedList;

public class GeometryLinkedList {
    private LinkedList<Geometry2D> geometries2D = new LinkedList<>();
    private LinkedList<Geometry3D> geometries3D = new LinkedList<>();

    public void addGeometry(Geometry2D geometry) {
        geometries2D.add(geometry);
    }

    public void addGeometry(Geometry3D geometry) {
        geometries3D.add(geometry);
    }

    public void removeGeometry(Geometry2D geometry) {
        geometries2D.remove(geometry);
    }

    public void removeGeometry(Geometry3D geometry) {
        geometries3D.remove(geometry);
    }

    public Geometry2D findGeometry2D(int index) {
        return geometries2D.get(index);
    }

    public Geometry3D findGeometry3D(int index) {
        return geometries3D.get(index);
    }

    public LinkedList<Geometry2D> getGeometries2D() {
        return geometries2D;
    }

    public LinkedList<Geometry3D> getGeometries3D() {
        return geometries3D;
    }
}