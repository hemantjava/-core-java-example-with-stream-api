package com.example.corejavaexamplewithstreamapi.lombok;


import java.util.List;

public class Student {
     private final Integer id;
     private final String name;
     private final List<String> skills;

    Student (Integer id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public static StudentBuilder builder ( ) {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private Integer id;
        private String name;
        private List<String> skills;

        StudentBuilder ( ) {
        }

        public StudentBuilder id (Integer id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name (String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder skills (List<String> skills) {
            this.skills = skills;
            return this;
        }

        public Student build ( ) {
            return new Student(id, name, skills);
        }

        public String toString ( ) {
            return "Student.StudentBuilder(id=" + this.id + ", name=" + this.name + ", skills=" + this.skills + ")";
        }
    }
}
