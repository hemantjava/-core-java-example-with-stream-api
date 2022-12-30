package com.example.corejavaexamplewithstreamapi.interview.dto;


public class Student {

    private Integer studentID;
    private String firstName;
    private String lastName;
    private Integer mark;

    public Student (Integer studentID, String firstName, String lastName, Integer mark) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }
    @Override
    public String toString ( ) {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mark=" + mark +
                '}';
    }

    public Integer getStudentID ( ) {
        return studentID;
    }

    public void setStudentID (Integer studentID) {
        this.studentID = studentID;
    }

    public String getFirstName ( ) {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName ( ) {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public Integer getMark ( ) {
        return mark;
    }

    public void setMark (Integer mark) {
        this.mark = mark;
    }
}

