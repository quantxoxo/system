abstract class Shape {
    int a;
    int b;

    abstract void printArea();
}

class Rectangle extends Shape {

    Rectangle(int length, int width) {
        a = length;
        b = width;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        System.out.println(
            "Area of Triangle = " + (0.5 * a * b)
        );
    }
}

class Circle extends Shape {

    Circle(int radius) {
        a = radius;
    }

    void printArea() {
        System.out.println(
            "Area of Circle = " + (3.14 * a * a)
        );
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(10, 5);
        Shape c = new Circle(5);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
