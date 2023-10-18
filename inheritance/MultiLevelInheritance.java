package inheritance;

class Rectangle {
    int length;
    int width;
    
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    int area() {
        return length * width;
    }
}

class Cuboid extends Rectangle {
    int height;
    
    Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
    
    int volume() {
        return area() * height;
    }
}

class Box extends Cuboid {
    int pricePerUnit;

    Box(int length, int width, int height, int pricePerUnit) {
        super(length, width, height);
        this.pricePerUnit = pricePerUnit;
    }

    int totalPrice() {
        return volume() * pricePerUnit;
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4, 5);
        System.out.println("Price: " + box.totalPrice());
    }
}
