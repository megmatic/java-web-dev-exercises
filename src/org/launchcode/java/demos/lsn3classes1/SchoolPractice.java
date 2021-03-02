package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class SchoolPractice {
    public static void main(String[] args) {

        Student meg = new Student("Meg", 78934, 1, 3.2);
        Student milo = new Student("Milo", 74839, 8, 3.9);

        Teacher lovelace = new Teacher("Ada", "Lovelace", "Computer Science", 25);

        HashMap<String, Integer> roster1 = new HashMap<>();
        roster1.put(meg.getName(), meg.getStudentId());
        roster1.put(milo.getName(), milo.getStudentId());

        Course java101 = new Course("Java 101", roster1, 3, lovelace.getLastName());

        System.out.println(java101.getClassName() + " with " + java101.getTeacher());



    }
}
