package abstractclass;

abstract class Polygon {
    abstract void whoAmI();
}

class Rectangle extends Polygon {
    @Override
    void whoAmI() {
        System.out.println("I am a rectangle");
    }
}

class Triangle extends Polygon {
    @Override
    void whoAmI() {
        System.out.println("I am a triangle");
    }
}

abstract class Quadrilateral extends Polygon { // abstract class can extend abstract class
    // since we don't implement the abstract method here, we have to make this class abstract
}

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.whoAmI();
    }
}
