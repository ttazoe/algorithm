package org.example.recursion;

import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KochCurve {



    public void solve(Point p1, Point p2, int n) {
        if (n == 0) return;

        Point s = new Point((p1.getX() + p2.getX()) / 3, (p1.getY() + p2.getY()) / 3);
        Point t = new Point((p1.getX() + p2.getX()) * 2 / 3, (p1.getY() + p2.getY()) * 2 / 3);
        Point u = new Point(s.getX() + (t.getX() - s.getX()) * Math.cos(Math.PI * 60 / 180), s.getY() + (t.getX() - s.getX()) * Math.sin(Math.PI * 60 / 180));

        System.out.println(s);
        System.out.println(u);
        System.out.println(t);

        solve(p1, s, n - 1);
        solve(s, u, n - 1);
        solve(u, t, n - 1);
        solve(t, p2, n - 1);
    }
}
