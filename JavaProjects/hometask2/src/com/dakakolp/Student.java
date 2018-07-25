package com.dakakolp;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{

    private String name;
    private String numberOfGroup;
    private short[] marks;
    private float averageValue;
    private static int index = 1;

    public Student(){
        this.name = "Name " + index;
        this.numberOfGroup = "Group " + index + index + 0;
        short[] marks = new short[5];
        for(int j = 0; j < marks.length; j++){
            marks[j] = (short)(3 + Math.random() * 3);
        }
        setMarksAndAverageValue(marks);
        index++;
    }

    public void outPrintStudent(){
        System.out.println(this);
    }

    public short[] getMarks() {
        return marks;
    }

    public float getAverageValue() {
        return averageValue;
    }

    public void setMarksAndAverageValue(short[] marks) {
        Arrays.sort(marks);
        this.marks = new short[5];
        short sum = 0;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
            sum += marks[i];
        }
        this.averageValue = (float)sum / marks.length;
    }

    //minAV->maxAV
    @Override
    public int compareTo(Student o) {
         if (o.getAverageValue() < this.getAverageValue()) return 1;
         else if (o.getAverageValue() > this.getAverageValue()) return -1;
         else return 0;
    }
    //maxAV->minAV
    public static final Comparator<Student> COMPARE_BY_AVERAGE = (o1, o2) -> {
        if (o1.getAverageValue() < o2.getAverageValue()) return 1;
        else if (o1.getAverageValue() > o2.getAverageValue()) return -1;
        else return 0;
    };

    @Override
    public String toString() {
        return (name + "\n" +
                numberOfGroup + "\n" +
                Arrays.toString(marks) + "\n" +
                averageValue);
    }
}