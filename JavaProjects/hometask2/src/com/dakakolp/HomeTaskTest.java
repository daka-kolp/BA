package com.dakakolp;

import java.util.Arrays;

public class HomeTaskTest {
    public static void main(String[] args) {
        //1
        studentTask1();

        //3
        newClassTask3();

        //4
        decCounterTask4();

    }

    // 1 Students
    public static void studentTask1(){
        Student[] students = new Student[10];
        for(int i = 0; i < students.length; i++){
            students[i] = Student.createStudent();
        }

        for(int i = 0; i < students.length; i++) {
            System.out.println("\n - Student " + i + " -");
            students[i].outPrintStudent();
        }

        sortStudents(students);

        highAchievers(students);
    }

    public static void highAchievers(Student[] students) {

        System.out.println("\n\n\t--- High Achievers ---\n\n");

        short[] marks;
        for(int i = 0; i < students.length; i++) {
            int countMarks = 0;
            marks = students[i].getMarks();
            for(int j = 0; j < marks.length; j++) {
                if(marks[j] >= 4) {
                    countMarks++;
                    if (countMarks == marks.length)
                        System.out.println(students[i] + "\n");
                }
            }
        }
    }

    public static void sortStudents(Student[] students) {
//        Insertion sort:

//        Student tmp;
//        for (int i = 1, j; i < students.length; ++i) {
//            tmp = students[i];
//            for (j = i - 1; j >= 0 && students[i].getAverageValue() > tmp.getAverageValue(); --j)
//                students[j + 1] = students[j];
//            students[j + 1] = tmp;
//        }

//        Arrays.sort(students);
        Arrays.sort(students, Student.COMPARE_BY_AVERAGE);

        System.out.println("\n\n\t--- Sorted students ---\n\n");

        for(int i = 0; i < students.length; i++) {
            System.out.println("\n - Student " + i + " -");
            students[i].outPrintStudent();
        }

    }

    //3 NewClass
    public static void newClassTask3() {
        NewClass nc = new NewClass(12, 30.27);

        nc.outPrint();
        System.out.println("sum:" + nc.sum());
        nc.findMax();
        nc.setOne(62);
        nc.setTwo(62);
        nc.findMax();
    }

    //4 DecCounter
    public static void decCounterTask4() {
        DecCounter dc1 = new DecCounter();
        DecCounter dc2 = new DecCounter(50);

        System.out.println("dc1: " + dc1.getCounter());
        dc1.count(150);
        dc1.decrem(); // +1
        System.out.println("New dc1: " + dc1.getCounter() + "\n");

        System.out.println("dc2: " + dc2.getCounter());
        dc2.count(25);
        for(int i = 1; i <= 5; i++) dc2.increm();// +5
        System.out.println("New dc2: " + dc2.getCounter());

    }


}
