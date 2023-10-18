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

class Cube extends Rectangle {
    int height;
    
    Cube(int height) {
        super(2, 3);
        this.height = height;
    }
    
    int volume() {
        return area() * height;
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Area: " + rectangle.area());
        Cube cube = new Cube(4);
        System.out.println("Volume: " + cube.volume());
    }
}
