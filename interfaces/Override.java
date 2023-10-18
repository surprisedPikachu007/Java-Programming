package interfaces;

interface Quadrilateral {
    default int getArea() {
        return 4;
    }
}

class Rectangle implements Quadrilateral {
    public int getArea() {
        return 5;
    }
}

public class Override {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = (Quadrilateral) new Rectangle();
        System.out.println(quadrilateral.getArea());
    }
}
