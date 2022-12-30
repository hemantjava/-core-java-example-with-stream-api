package com.example.corejavaexamplewithstreamapi.interview.service;


import com.example.corejavaexamplewithstreamapi.interview.dto.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListByMarks {

    //java 8
    public static void sort (List<Student> studentList) {
        final Comparator<Student> comparingMark = Comparator.comparing(Student::getMark, Comparator.reverseOrder());
        final Comparator<Student> comparingFistName = Comparator.comparing(Student::getFirstName, Comparator.reverseOrder());
        final Comparator<Student> comparingLastName = Comparator.comparing(Student::getLastName, Comparator.reverseOrder());
        final Comparator<Student> studentComparator = comparingMark.thenComparing(comparingFistName)
                .thenComparing(comparingLastName);
        Collections.sort(studentList, studentComparator);
    }

    //java 7
    public static Comparator<Student> marks = new Comparator<Student>() {

        @Override
        public int compare (Student o1, Student o2) {
            int val = 0;
            val = (o2.getMark() - o1.getMark());
            if (val == 0) {
                val = o2.getFirstName().compareTo(o1.getFirstName());
                if (val == 0) {
                    val = o2.getLastName().compareTo(o1.getLastName());
                }
            }
            return val;

        }
    };
}
