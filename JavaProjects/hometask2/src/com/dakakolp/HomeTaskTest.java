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

    //1 Students
    private static void studentTask1() {
        Student[] students = new Student[10];
        for (int i = 0, j = 1; i < students.length; i++, j++) {
            System.out.format("\n - Student %d - \n", j);
            students[i] = new Student();
            students[i].outPrintStudent();
        }

        sortStudents(students);

        highAchievers(students);
    }

    private static void highAchievers(Student[] students) {

        System.out.println("\n\n\t--- High Achievers ---\n\n");

        short[] marks;
        for (Student student : students) {
            int countMarks = 0;
            marks = student.getMarks();
            for (short mark : marks) {
                if (mark >= 4) {
                    countMarks++;
                    if (countMarks == marks.length)
                        System.out.println(student + "\n");
                }
            }
        }
    }

    private static void sortStudents(Student[] students) {
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

        for (int i = 0, j = 1; i < students.length; i++, j++) {
            System.out.format("\n - Student %d - \n", j);
            students[i].outPrintStudent();
        }

    }

    //3 NewClass
    private static void newClassTask3() {
        NewClass nc = new NewClass(15, 30.27);

        nc.outPrint();
        System.out.format("sum: %.2f\n", nc.sum());
        nc.findMax();
        nc.setOne(62);
        nc.setTwo(62);
        nc.outPrint();
        nc.findMax();
    }

    //4 DecCounter
    private static void decCounterTask4() {
        DecCounter dc1 = new DecCounter();
        DecCounter dc2 = new DecCounter(50);

        //first counter
        System.out.println("dc1: " + dc1.getCounter());
        //from 100 to 150
        dc1.count(150);
        try {
            dc1.decrem(); // -1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("New dc1: " + dc1.getCounter() + "\n");

        //second counter
        System.out.println("dc2: " + dc2.getCounter());
        //from 50 to 25
        dc2.count(25);
        for (int i = 1; i <= 5; i++) {
            try {
                dc2.increm();// +5
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("New dc2: " + dc2.getCounter());

    }


}
