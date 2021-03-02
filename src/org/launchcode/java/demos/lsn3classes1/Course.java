package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {

    private String className;
    private HashMap<String, Integer> roster;
    private Integer credit;
    private String teacher;

    public Course(String className, HashMap<String, Integer> roster, Integer credit, String teacher) {
        this.className = className;
        this.roster = roster;
        this.credit = credit;
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public String getTeacher() {
        return teacher;
    }
}
