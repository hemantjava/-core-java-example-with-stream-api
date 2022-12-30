package com.example.corejavaexamplewithstreamapi.designpattern.creational.builder;

//Immutable class throw builder pattern
public class Student {
    //1. final properties
    final private Integer id;
    final private String name;
    final private Integer age;

    //2. initialization properties throw Constructor
    private  Student (Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    //3. Inner static builder class which having same fields
    public static class StudentBuilder  {
         private Integer id;
         private String name;
         private Integer age;

         //4. create only setter method which return type Builder class
        public StudentBuilder id (Integer id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name (String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age (Integer age) {
            this.age = age;
            return this;
        }

        //5 private constructor
        private StudentBuilder(){}

        // 6 build method return final object
        public Student build(){
            return new Student(id, name, age);
        }
    }

    //4. factory method return builder object
    public static StudentBuilder builder(){
        //default constructor
        return new StudentBuilder();
    }
    @Override
    public String toString ( ) {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
