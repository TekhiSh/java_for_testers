package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printArea(new Square(7.0));
        Square.printArea(new Square(5.0));
        Square.printArea(new Square(3.0));

        Rectangle.printArea(new Rectangle(7.0, 4.0));
        Rectangle.printArea(new Rectangle(9.0, 5.0));

        Triangle.printArea(new Triangle(5, 8, 7));
        Triangle.printPerimeter(new Triangle(6, 12, 9));
    }

}
