package com.brainacad.oop.testshapes;


import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    private String color;

    Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +", color is: " + color + ". Area: " + calcArea() +"\n";
    }

    public abstract double calcArea();

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Triangle("white", 2,6,7));
        shapes.add(new Rectangle("red", 10,7));
        shapes.add(new Circle("black", 25));
        shapes.add(new Triangle("blue", 10,10,10));
        shapes.add(new Rectangle("pink", 4,8));
        shapes.add(new Circle("yellow", 12));

        for (Shape shape : shapes) {
            if(shape instanceof Circle)
                ((Circle) shape).sum();
            if(shape instanceof Rectangle)
                ((Rectangle) shape).sum();
            if (shape instanceof Triangle)
                ((Triangle) shape).sum();
        }

        System.out.printf("\nSumCircleArea: %.2f\n", Circle.getSumCircleArea());
        System.out.printf("\nSumRectangleArea: %.2f\n", Rectangle.getSumRectangleArea());
        System.out.printf("\nSumTriangleArea: %.2f\n", Triangle.getSumTriangleArea());

        System.out.println("---------------");

        for (Shape shape : shapes) {
            System.out.printf("\n%s: %.2f\n", shape.getClass().getSimpleName(), shape.calcArea());
        }

    }
}
