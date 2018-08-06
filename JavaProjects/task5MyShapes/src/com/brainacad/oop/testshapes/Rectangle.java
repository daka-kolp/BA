package com.brainacad.oop.testshapes;

public class Rectangle extends Shape implements Comparable<Rectangle> {

    private static double sumRectangleArea;
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public static double getSumRectangleArea() {
        return sumRectangleArea;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return super.toString() + " sideA = " + sideA + ", sideB = " + sideB;
    }

    public void sum() {
        sumRectangleArea += this.calcArea();
    }

    @Override
    public void draw() {
        System.out.printf("\n%s Rectangle's area: %.2f\n", toString(), calcArea());
    }

    @Override
    public int compareTo(Rectangle o) {
        if(this.calcArea() > o.calcArea()) return 1;
        else if(this.calcArea() < o.calcArea()) return -1;
        else return 0;
    }
}
