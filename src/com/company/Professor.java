package com.company;

import java.util.List;

public class Professor extends Person
{
    private String subject;
    private String faculty;
    private List<String> groups;

    public Professor(String name, String emailAddress, int age, char gender,List<String> groups, String subject, String faculty ){
        super(name, age, gender, emailAddress );
        this.groups = groups;
        this.faculty = faculty;
        this.subject = subject;
    }

    public String getSubject() { return subject; }
    public String getFaculty() { return faculty; }
    public List<String> groups(){return groups;}

    public void setSubject( String subject ) {this.subject = subject;}
    public void setFaculty( String faculty ) {this.faculty = faculty;}
    public void setGroups (List<String> groups) {this.groups = groups;}

    //Prints the groups on which the professor is teaching.
    public String printGroups(){
        String line = "";
        for (String group : groups) {
            line += group + " ";
        }
        return line;
    }

    @Override
    public String ToString(){
        return "Name: " + getName() +
                "\nSubject: " + getSubject() +
                "\nFaculty: " + getFaculty() +
                "\nGroups: " + printGroups();
    }

}
