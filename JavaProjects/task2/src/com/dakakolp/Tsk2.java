package com.dakakolp;

public class Tsk2 {
    public static void main(String[] args) {

        Computer[] arrComp = new Computer[5];
        for (int i = 0; i < arrComp.length; i++) {
            arrComp[i] = new Computer();
            arrComp[i].setPrice(100.0f + (float)Math.random() * 50.0f);
            System.out.println("CompPrice " + i + ": " + arrComp[i].getPrice());
        }

        System.out.println("\n----------------\n");

        for(int i = 0; i < arrComp.length; i++) {
            arrComp[i].setPrice(arrComp[i].getPrice() * 0.1f + arrComp[i].getPrice());
            System.out.println("NewCompPrice " + i + ": " + arrComp[i].getPrice());
        }
    }
}
