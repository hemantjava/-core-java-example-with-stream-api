package com.example.corejavaexamplewithstreamapi.Cloneing;

public class Main {
    public static void main (String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Hemant");
        Address address1 = new Address();
        address1.setCity("Karnataka");
        address1.setZipCode(560046);
        e1.setAddress(address1);
        System.out.println("e1: " + e1);
        final Employee e2 = e1.clone();
        final Address a2 = e2.getAddress();
        e2.setName("sarita");
        a2.setZipCode(560048);
        System.out.println("e2: "+e2);
        System.out.println("e1: " + e1);


    }
}
