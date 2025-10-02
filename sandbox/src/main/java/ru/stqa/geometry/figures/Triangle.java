package ru.stqa.geometry.figures;

import java.util.Objects;

public record Triangle(double a, double b, double c) {

    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
          throw new IllegalArgumentException("Triangle inequality must hold");
        }
    }

    public static void printArea(Triangle triangle) {
        var text = String.format("Площадь треугольника со сторонами %f,  %f и  %f= %f",
                triangle.a, triangle.b, triangle.c, triangle.area());
        System.out.println(text);
    }

    public static void printPerimeter(Triangle triangle) {
        var text = String.format("Периметр треугольника со сторонами %f,  %f и  %f= %f",
                triangle.a, triangle.b, triangle.c, triangle.perimeter());
        System.out.println(text);
    }

    public double perimeter() {
        return (this.a + this.b + this.c);
    }

    public double area() {
        double s = this.perimeter()/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.a, triangle.a) == 0
                && Double.compare(this.b, triangle.b) == 0
                && Double.compare(this.c, triangle.c) == 0)
                ||(Double.compare(this.b, triangle.a) == 0
                && Double.compare(this.c, triangle.b) == 0
                && Double.compare(this.a, triangle.c) == 0)
                ||(Double.compare(this.c, triangle.a) == 0
                && Double.compare(this.a, triangle.b) == 0
                && Double.compare(this.b, triangle.c) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
