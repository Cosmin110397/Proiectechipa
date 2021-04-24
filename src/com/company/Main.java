package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> groups = new ArrayList<>();
        groups.add("Grupa1");
        groups.add("Grupa3");

        Professor professor1 = new Professor("Popescu Andrei", "popescu_andrei23@gmail.com", 34, 'M', groups,
                "Matematica", "Mate-Info");
        System.out.println(professor1.ToString());
    }
}
