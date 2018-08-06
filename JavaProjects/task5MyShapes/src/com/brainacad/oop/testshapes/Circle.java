package com.brainacad.oop.testshapes;

import java.util.Comparator;

public class Circle extends Shape implements Comparable<Circle>{

    private static double sumCircleArea;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public static double getSumCircleArea() {
        return sumCircleArea;
    }

    public void sum() {
        sumCircleArea += this.calcArea();
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " radius = " + radius;
    }

    @Override
    public void draw() {
        System.out.printf("\n%s Circle's area: %.2f\n", toString(), calcArea());
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.calcArea(), o.calcArea());
    }

}
