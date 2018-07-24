package com.dakakolp;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{

    private String name;
    private String numberOfGroup;
    private short[] marks;
    private float averageValue;
    private static int index = 0;

    public static Student createStudent(){
        Student student = new Student();
        student.setName("Name " + index);
        student.setNumberOfGroup("Group " + index + index + 0);
        short[] marks = new short[5];
        for(int j = 0; j < marks.length; j++){
            marks[j] = (short)(3 + Math.random() * 3);
        }
        Arrays.sort(marks);//, Collections.reverseOrder());
        student.setMarksAndAverageValue(marks);
        index++;
        return student;
    }

    public void outPrintStudent(){
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public String getNumberOfGroup() {
        return numberOfGroup;
    }

    public short[] getMarks() {
        return marks;
    }

    public float getAverageValue() {
        return averageValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfGroup(String numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public void setMarksAndAverageValue(short[] marks) {
        this.marks = new short[5];
        short sum = 0;
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = 0;
        }
        try {
            if (marks.length > 5) {
                throw new NullPointerException();
            }
            try {
                for (int i = 0; i < marks.length; i++) {
                    if (marks[i] >= 2 && marks[i] <= 5)
                        this.marks[i] = marks[i];
                    else
                        throw new IncorrectValueException();
                    sum += this.marks[i];
                }
            }catch (IncorrectValueException e) {
                e.printStackTrace(System.out);
            }
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
        }
        this.averageValue = (float)sum/this.marks.length;
    }

    @Override
    public int compareTo(Student o) {
         if (o.getAverageValue() > this.getAverageValue()) return 1;
         else if (o.getAverageValue() < this.getAverageValue()) return -1;
         else return 0;
    }

    public static final Comparator<Student> COMPARE_BY_AVERAGE = (o1, o2) -> {
        if (o1.getAverageValue() < o2.getAverageValue()) return 1;
        else if (o1.getAverageValue() > o2.getAverageValue()) return -1;
        else return 0;
    };

    @Override
    public String toString() {
        return (getName() + "\n" +
                getNumberOfGroup() + "\n" +
                Arrays.toString(getMarks()) + "\n" +
                getAverageValue());
    }

    private class IncorrectValueException extends Exception {}
}