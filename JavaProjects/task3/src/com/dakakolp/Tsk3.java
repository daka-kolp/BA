package com.dakakolp;

import java.util.Scanner;

public class Tsk3 {
    public static void main(String[] args) {

        //1
//        matrixTask1();

        //2
//        accountantTask2();

        //3
//        personTask3();

        //4
//        ATask4();
    }

    //1
    public static void matrixTask1() {
        int size = 5;

        int[][] m1 = new Matrix().createMatrix(size);
        int[][] m2 = new Matrix().createMatrix(size);

        int[][] addMatrix = new Matrix().add(m1, m2);

        int[][] mulMatrix = new Matrix().multiply(m1, m2);

        outPrint(m1);

        outPrint(m2);

        outPrint(addMatrix);

        outPrint(mulMatrix);
    }

    public static void outPrint(int[][] m) {

        System.out.println();
        for (int[] aM : m) {
            for (int j = 0; j < aM.length; j++) {
                System.out.printf("%7d", aM[j]);
            }
            System.out.println();
        }
    }

    //2
    public static void accountantTask2() {
        Employee e = new Employee();

        e.createEmployee("Tanya", 50.3, 18.3, 23.2, 15.5);
        e.outPrint();

        double[] arr = {12.5, 13.7, 18.9};
        e.createEmployee("Ivan", arr);
        e.outPrint();

        e.createEmployee("Mira");
        e.outPrint();
    }

    //3
    public static void personTask3() {
        Person p = new Person();
        p.setInfo();
        p.setInfo("Petr", "Petrov");
        p.setInfo("Petrov", 1234578);
        p.setInfo("Sasha", "Sidorov", 20);
        p.setInfo("Maria", 30, 'f');
        p.setInfo("Litvinenko", 25, 4561278);
    }

    //4
    public static void ATask4() {
        Scanner s = new Scanner(System.in);

        System.out.print("Rectangle <height> <width>: ");
        Double height = s.nextDouble();
        Double width = s.nextDouble();

        System.out.print("Foursquare <side>: ");
        Double side = s.nextDouble();

        System.out.print("Circle <side>: ");
        Double radius = s.nextDouble();

        s.close();

        A a = new A();
        System.out.printf("\nRectangle: %.2f\n", a.calcSquare(height, width));
        System.out.printf("\nFoursquare: %.2f\n", a.calcSquare(side));
        System.out.printf("\nCircle: %.2f\n",  a.calcSquareC(radius));

        //a.square(5);
    }

}
