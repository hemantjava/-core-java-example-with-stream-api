package com.example.corejavaexamplewithstreamapi.designpattern.creational.builder;
//Builder Pattern
public class Car {
    private Integer id;
    private String name;
    private Integer age;

    private  Car (Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId ( ) {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Integer getAge ( ) {
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public static CarBuilder builder ( ) {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private Integer id;
        private String name;
        private Integer age;

       /* CarBuilder ( ) {
        }*/

        public CarBuilder id (Integer id) {
            this.id = id;
            return this;
        }

        public CarBuilder name (String name) {
            this.name = name;
            return this;
        }

        public CarBuilder age (Integer age) {
            this.age = age;
            return this;
        }

        public Car build ( ) {
            return new Car(id, name, age);
        }


    }

    @Override
    public String toString ( ) {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
