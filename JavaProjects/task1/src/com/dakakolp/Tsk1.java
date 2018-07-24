package com.dakakolp;

import java.util.Random;

public class Tsk1 {
    public static void main(String[] args) {
        Random random = new Random();
        char[] chars = new char[10];

        for(int i = 0; i < 10; i++){
            chars[i] = (char)(65 + random.nextInt(58));
            System.out.println(chars[i]);
        }

        System.out.println("--------");

        for(int i = 0; i < 10; i++){
            if(chars[i]%2 == 0){
                System.out.println((short)chars[i] + " chetnoe");
            } else {
                System.out.println((short)chars[i] + " nechetnoe");
            }
        }
    }
}
