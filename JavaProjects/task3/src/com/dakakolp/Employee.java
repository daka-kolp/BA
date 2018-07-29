package com.dakakolp;

public class Employee {

    private String name;
    private double totalSalary;

    public void createEmployee(String name, double... salary) {
        this.name = name;
        double totalSalary = 0.0;
        for(double s : salary){
            totalSalary += s;
        }
        this.totalSalary = totalSalary;
    }

    public void outPrint(){
        System.out.format("Employee's name: %s\nSalary: %.2f\n", name, totalSalary);
    }
}
