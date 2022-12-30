package com.example.corejavaexamplewithstreamapi.stream.dto;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Emp> empList = Arrays.asList(Emp.builder().clg("dg").id(12).name("sonu").build(),
                Emp.builder().clg("du").id(13).name("sonu").build(),
                Emp.builder().clg("dy").id(14).name("sonu").build(),
                Emp.builder().clg("dt").id(15).name("sonu").build());

        System.out.println(empList);
        final List<EmpDto> collect = EmpDto.getEmp(empList);
        System.out.println(collect);
    }
}
