package com.brainacad.oop.testshapes;

public class Circle extends Shape {

    private double radius;

    private static double sumCircleArea;

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

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + " radius = " + radius;
    }
}
