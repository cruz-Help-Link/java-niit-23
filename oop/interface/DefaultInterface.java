
// To use the sqrt function
import java.lang.Math;

interface Shape {
    void getArea();

    // calculate the perimeter of a Shape
    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }

        System.out.println("Perimeter: " + perimeter);
    }
    static void getName(String name) {
        System.out.println(name);
    }
}

class Triangle implements Shape {
    private int a, b, c;
    private double s, area;

    // initializing sides of a triangle
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    // calculate the area of a triangle
    public void getArea() {
        s = (double) (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
    }
}

class DefaultInterface {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 3, 4);

        // calls the method of the Triangle class
        t1.getArea();

        // calls the method of Shape
        t1.getPerimeter(2, 3, 4);
        Shape.getName("Triangle");
    }
}