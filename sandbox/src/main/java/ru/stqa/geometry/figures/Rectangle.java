package ru.stqa.geometry.figures;

public class Rectangle {
    public static void printArea(double a, double b) {
        var text = String.format("Площадь прямоугольника со сторонами %f  %f = %f", a, b, area(a, b));
        System.out.println(text);
    }

    private static double area(double a, double b) {
        return a * b;
    }
}
