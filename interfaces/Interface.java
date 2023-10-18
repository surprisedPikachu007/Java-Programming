package interfaces;

interface Quadrilateral {
    int getArea();
}

interface Polygon {
    int getArea();
    int getSides();
}

class Rectangle implements Polygon, Quadrilateral {
    public int getSides() {
        return 4;
    }

    public int getArea() {
        return 2;
    } 
}

public class Interface {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getSides());
    }
}

