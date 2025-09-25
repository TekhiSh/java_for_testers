package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {

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
}
