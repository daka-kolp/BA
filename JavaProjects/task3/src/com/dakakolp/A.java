package com.dakakolp;

public class A {
    public double calcSquare(double height, double width) {
        return height * width;
    }
    public double calcSquare(double side) {
        return Math.pow(side, 2);
    }
    public double calcSquareC(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public int square(final int s) {
        //s = s*s;
        System.out.println(s*s);
        return s;
    }


}
