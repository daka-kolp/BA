package com.dakakolp;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        this.width = 5.5;
        this.height = 12.5;
        this.numberOfGlass = 4;
        this.color = "White";
        this.isOpen = false;
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = 4;
        this.color = "White";
        this.isOpen = false;
    }

    private MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }


    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height, numberOfGlass, "Black", true);
    }

    public MyWindow(int numberOfGlass, String color, boolean isOpen) {
        this(10.5, 15.5, numberOfGlass, color, true);
    }

    public void printFields() {
        System.out.printf("\n\nWidth: %.2f\nHeight: %.2f\nNumberOfGlass: %d\nColor: %s\nIsOpen: %s",
                width, height, numberOfGlass, color, isOpen);
    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
