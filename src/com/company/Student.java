package com.company;

import java.util.List;

public class Student extends Person
{
    private List<Integer> grades ;
    private String group;
    private int year;
    private String specialization;

    public Student(String name, int age , char gender, String emailAddress, String group, List<Integer> grades, int year , String specialization) {
        super(name,age,gender,emailAddress);
        this.group = group;
        this.grades = grades;
        this.year = year;
        this.specialization = specialization;

    }

    public String getGroup() { return group; }
    public void setGroup(String group) {
        this.group = group;
    }

    public List<Integer> getGrades() { return grades; }
    public void setGrades (List<Integer> grades) {this.grades = grades;}

    public void setGrade(int grade) { this.grades.add(grade)};

    public int  getYear() {return year; }
    public void setYear(int year) {this.year = year;}

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) {this.specialization = specialization; }


    @Override
    public String ToString() {
            return "Grupa: " + getGroup()
                    + "Notele: " + getGrades()
                    + "Anul: " + getYear()
                    + "Specializarea: " + getSpecialization();
    }

   //Calculates The Average Of Grades
   private double calculateAverageGrades() {
       int sum = 0;
       for (int i=0; i< grades.size(); i++) {
           sum += grades.get(i);
       }
       return sum / grades.size();
   }
    }

}

