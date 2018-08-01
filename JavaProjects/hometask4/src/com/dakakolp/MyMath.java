package com.dakakolp;

public class MyMath {

    public static final double PI = 3.14;

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int a : arr)
            if (max < a)
                max = a;
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int a : arr) {
            if(min > a)
                min = a;
        }
        return min;
    }

    public static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }
}
