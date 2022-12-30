package com.example.corejavaexamplewithstreamapi.stream.dto;

import lombok.Builder;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@ToString
@Builder
public class EmpDto {

    private String name;
    private Integer id;


    @ToString.Exclude
    private final Emp emp;

    public EmpDto (Emp emp) {
        this.emp = emp;
    }

    public EmpDto (String name, Integer id, Emp emp) {
        this.name = name;
        this.id = id;
        this.emp = emp;
    }

    public String getName ( ) {
        return this.emp.getName();
    }

    public Integer getId ( ) {
        return this.emp.getId();
    }

    public static List<EmpDto> getEmp (List<Emp> empList) {
        return empList.stream().map(EmpDto::new).collect(Collectors.toList());
    }


}
