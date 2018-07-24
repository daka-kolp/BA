package com.dakakolp;

public class DecCounter {

    private int counter;

    public DecCounter(int counter) {
        this.counter = counter;
    }
    public DecCounter() {
        this.counter = 100;
    }

    public int increm(){
        return ++counter;
    }

    public int decrem(){
        return --counter;
    }

    public int getCounter(){
        return counter;
    }

    public void count(int border) {
        System.out.println("\nThe counting: ");
        if(border > counter) {
            while(counter != border){
                System.out.print(increm() + " ");
            }
        } else if(border < counter) {
            while (counter != border)
                System.out.print(decrem() + " ");
        }
        System.out.println("\n");
    }
}
