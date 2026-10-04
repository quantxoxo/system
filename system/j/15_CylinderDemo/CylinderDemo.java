abstract class Shape {
    abstract void area();

    abstract void volume();
}

class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    void area() {
        double a = 2 * 3.14 * radius * (radius + height);

        System.out.println("Area = " + a);
    }

    void volume() {
        double v = 3.14 * radius * radius * height;

        System.out.println("Volume = " + v);
    }
}

class CylinderDemo {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(5, 10);

        c.area();
        c.volume();
    }
}
