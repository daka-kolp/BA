package com.dakakolp;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private int phoneNumber;

    public void setInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.printf("\nName: %s\nSurname: %s\n", this.firstName, this.lastName);
    }

    public void setInfo(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.printf("\nName: %s\nSurname: %s\nAge: %d\n", this.firstName, this.lastName, this.age);
    }

    public void setInfo(String firstName, int age, char gender) {
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        System.out.printf("\nName: %s\nAge: %d\nGender: %s\n", this.firstName, this.age, this.gender);
    }

    public void setInfo(String lastName, int phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        System.out.printf("\nSurname: %s\nPhone: %d\n", this.lastName, this.phoneNumber);
    }

    public void setInfo(String lastName, int age, int phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        System.out.printf("\nSurname: %s\nAge: %d\nPhone: %d\n", this.lastName, this.age, this.phoneNumber);
    }

    public void setInfo() {
        firstName = "Ivan";
        lastName = "Ivanov";
        age = 18;
        gender = 'm';
        phoneNumber = 7774411;
        System.out.printf("\nName: %s\nSurname: %s\nAge: %d\nGender: %s\nPhone: %d\n", firstName, lastName, age, gender, phoneNumber);
    }
}
