package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculateArea () {
        var s = new Triangle(6, 8, 10);
        double result = s.area();
        Assertions.assertEquals(24.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Triangle(6, 6,8).perimeter());
    }
}
