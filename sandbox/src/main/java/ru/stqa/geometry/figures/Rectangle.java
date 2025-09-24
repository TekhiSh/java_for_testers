package ru.stqa.geometry.figures;

public record Rectangle(double a, double b) {

    public static void printArea(Rectangle a) {
        var text = String.format("Площадь прямоугольника со сторонами %f  %f = %f", a.a, a.b, a.area());
        System.out.println(text);
    }

    private static double area(double a, double b) {
        return a * b;
    }

    public double area() {
        return this.a * this.b;
    }
}
