package com.dakakolp;

public class NewClass {
    private int one;
    private  double two;

    public NewClass(int one, double two) {
        this.one = one;
        this.two = two;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public void setTwo(double two) {
        this.two = two;
    }

    public void outPrint() {
        System.out.println("one: " + one + "\ntwo: " + two);
    }

    public double sum() {
        return (double)one + two;
    }

    public void findMax(){
        if(one > two)
            System.out.println(one + ": one is max value.");

        else if (two > one)
            System.out.println(two + ": two is max value.");

        else System.out.println("one and two are equal.");

    }



}
