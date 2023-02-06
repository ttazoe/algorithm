package org.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KochCurveTest {
    @Test
    public void testKochCurve(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(100,0);
        KochCurve kochCurve = new KochCurve();

        System.out.println(p1);
        kochCurve.solve(p1,p2,2);
        System.out.println(p2);
    }

}