package com.dakakolp;

public class MyPyramid {

    public static void printPyramid(int h) {
        if (h > 9 || h < 1) {
            System.out.print("\nIncorrect argument's value...\n");
            return;
        }

        System.out.println("\t-Pyramid " + h + "-\n");
        for (int i = 1; i <= h; i++) {
            for(int j = h - i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for(int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
