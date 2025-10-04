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

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-3.0, -3.0,-3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void cannotBreakTriangleInequality () {
        try {
            new Triangle(3.0, 4.0, 8.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void testEquality() {
        var t1 = new Triangle(5.0, 7.0, 9.0);
        var t2 = new Triangle(5.0, 7.0, 9.0);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality2() {
        var t1 = new Triangle(5.0, 7.0, 9.0);
        var t2 = new Triangle(7.0, 9.0, 5.0);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality3() {
        var t1 = new Triangle(5.0, 7.0, 9.0);
        var t2 = new Triangle(9.0, 5.0, 7.0);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality4() {
        var t1 = new Triangle(5.0, 7.0, 9.0);
        var t2 = new Triangle(7.0, 5.0, 9.0);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality5() {
        var t1 = new Triangle(5.0, 7.0, 9.0);
        var t2 = new Triangle(5.0, 9.0, 7.0);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality6() {
        var t1 = new Triangle(5.0, 7.0, 9.0);
        var t2 = new Triangle(9.0, 7.0, 5.0);
        Assertions.assertEquals(t1, t2);
    }
}
