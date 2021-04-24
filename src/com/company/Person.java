package com.company;

import java.util.List;

public class Person {

    private int age;
    private String name;
    private char gender;
    private String emailAddress;

    public Person(String name, int age , char gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }
     public int getAge() { return age; }
     public String getName() { return name; }
     public char  getGender() {return gender; }
     public String getEmailAddress() { return emailAddress; }

    public void setAge(int age) {this.age = age;}
    public void setName( String name ) {this.name = name;}
    public void setGender (char gender) {this.gender = gender;}
    public void setEmailAddress ( String emailAddress) {this.emailAddress = emailAddress;}

    public String ToString() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nGender: " + getGender() +
                "\nEmailAddress: " + getEmailAddress();
    }

}
