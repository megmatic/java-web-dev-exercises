package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private Integer yearsTeaching;


    public Teacher(String firstName, String lastName, String subject, Integer yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }


    public String getLastName() {
        return lastName;
    }
}
