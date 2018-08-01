package com.dakakolp;

import java.util.ArrayList;
import java.util.List;

public class Tsk4 {
    public static void main(String[] args) {
       windowTask1();
    }

    //1
    public static void windowTask1() {
        MyWindow w1 = new MyWindow();

        MyWindow w2 = new MyWindow(3, "Blue", false);

        MyWindow w3 = new MyWindow(17.4, 13.6);

        MyWindow w4 = new MyWindow(2.5, 13.6, 5);

        MyWindow[] arr = new MyWindow[4];
        arr[0] = w1;
        arr[1] = w2;
        arr[2] = w3;
        arr[3] = w4;

        for (MyWindow a : arr) {
            System.out.println(a);
        }

        List<MyWindow> list = new ArrayList<MyWindow>();
        list.add(new MyWindow());
        list.add(new MyWindow(6, "Green", true));
        list.add(new MyWindow(16.5, 7.8));
        list.add(new MyWindow(14.3, 15.6, 5));

        for (MyWindow w : list) {
            w.printFields();
        }
    }

}
