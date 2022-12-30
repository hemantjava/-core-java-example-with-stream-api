package com.example.corejavaexamplewithstreamapi.interview.service;

import com.example.corejavaexamplewithstreamapi.interview.dto.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SortListByMarksTest {

    private static List<Student> studentList;

    static {
        studentList = Arrays.asList(new Student(121, "hemant", "sahu", 45),
                new Student(129, "sahu", "sahu", 46),
                new Student(120, "chitresh", "sahu", 33),
                new Student(101, "sarita", "sahu", 50),
                new Student(111, "shaw", "sahu", 50)
        );
    }

    @Test
    void sort ( ) {
        System.out.println(studentList);
        SortListByMarks.sort(studentList);
        System.out.println(studentList);
    }
}