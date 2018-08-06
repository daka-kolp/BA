package com.brainacad.oop.testshapes;

public class Triangle extends Shape implements Comparable<Triangle>{

    private static double sumTriangleArea;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static double getSumTriangleArea() {
        return sumTriangleArea;
    }

    @Override
    public double calcArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String toString() {
        return super.toString() + " sideA = " + sideA + ", sideB = " + sideB + ", sideC = " + sideC;
    }

    public void sum() {
        sumTriangleArea += this.calcArea();
    }

    @Override
    public void draw() {
        System.out.printf("\n%s Triangle's area: %.2f\n", toString(), calcArea());
    }

    @Override
    public int compareTo(Triangle o) {
        if(this.calcArea() > o.calcArea()) return 1;
        else if(this.calcArea() < o.calcArea()) return -1;
        else return 0;
    }
}
