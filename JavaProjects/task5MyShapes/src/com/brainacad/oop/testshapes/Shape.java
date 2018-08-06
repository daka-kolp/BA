package com.brainacad.oop.testshapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class Shape implements Drawable {

    protected String color;

    Shape(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Triangle("white", 2, 6, 7));
        shapes.add(new Rectangle("red", 10, 7));
        shapes.add(new Circle("black", 25));
        shapes.add(new Triangle("blue", 10, 10, 10));
        shapes.add(new Rectangle("pink", 4, 8));
        shapes.add(new Circle("yellow", 12));

        for (Shape shape : shapes) {
            if (shape instanceof Circle)
                ((Circle) shape).sum();
            if (shape instanceof Rectangle)
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

        System.out.println("---------------");

        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println("---------------");
        Rectangle[] arrRectangle = new Rectangle[6];
        arrRectangle[0] = new Rectangle("green", 100, 30);
        arrRectangle[1] = new Rectangle("yellow", 500, 100);
        arrRectangle[2] = new Rectangle("while", 10, 30);
        arrRectangle[3] = new Rectangle("pink", 5, 10);
        arrRectangle[4] = new Rectangle("brown", 1, 3);
        arrRectangle[5] = new Rectangle("blue", 20, 70);

        Arrays.sort(arrRectangle);
        for (Rectangle r : arrRectangle) {
            r.draw();
        }

        System.out.println("---------------");

        shapes.sort(SHAPE_COLOR_COMPARATOR);
        for (Shape r : shapes) {
            r.draw();
        }

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", color is: " + color + "\n";
    }

    public abstract double calcArea();

    public static final Comparator<Shape> SHAPE_COLOR_COMPARATOR = new Comparator<Shape>() {
        @Override
        public int compare(Shape o1, Shape o2) {
            return o1.color.compareToIgnoreCase(o2.color);
        }
    };
}
