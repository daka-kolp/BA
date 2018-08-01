package com.dakakolp;

public class MyCalc {

    private static double pi;

    public static double calcPi(int series) {
        if (series <= 0)
            return -1;

        double tmp;
        for (int i = 1, j = 0; i <= series; i++, j += 2) {
            tmp = 4.0 / (1 + j);
            if (i % 2 == 1)
                pi += tmp;
            else
                pi -= tmp;
        }
        return pi;
    }
}
