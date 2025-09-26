package ru.stqa.geometry.figures;

public record Rectangle(
        double a,
        double b) {

    public Rectangle {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("Rectangle side should be non-negative");
        }
    }

    public static void printArea(Rectangle rectangle) {
        var text = String.format("Площадь прямоугольника со сторонами %f  %f = %f", rectangle.a, rectangle.b, rectangle.area());
        System.out.println(text);
    }

    public double area() {
        return this.a * this.b;
    }
}
