package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {

    public static void printArea(Triangle triangle) {
        var text = String.format("Площадь треугольник со сторонами %f,  %f и  %f= %f",
                triangle.a, triangle.b, triangle.a, triangle.area());
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
