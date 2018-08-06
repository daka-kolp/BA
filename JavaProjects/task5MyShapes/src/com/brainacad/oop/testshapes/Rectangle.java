package com.brainacad.oop.testshapes;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    private static double sumRectangleArea;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return super.toString() + " sideA = " + sideA + ", sideB = " + sideB;
    }

    public static double getSumRectangleArea() {
        return sumRectangleArea;
    }

    public void sum() {
        sumRectangleArea += this.calcArea();
    }
}
