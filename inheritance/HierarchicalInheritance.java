package inheritance;

class Quadrilateral {
    int a, b, c, d;

    Quadrilateral(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    int perimeter() {
        return a + b + c + d;
    }

    float area() {
        // heron's formula
        float s = (a + b + c + d) / 2.0f;

        return s;
    }
}

class Rectangle extends Quadrilateral {
    Rectangle(int a, int b) {
        super(a, b, a, b);
    }

    int perimeter() {
        return 2 * (a + b);
    }

    float area() {
        return a * b;
    }
}

class Square extends Quadrilateral {
    Square(int a) {
        super(a, a, a, a);
    }

    int perimeter() {
        return 4 * a;
    }

    float area() {
        return a * a;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        
    }
}
