package com.example.corejavaexamplewithstreamapi.stream.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private String name;
    private String clg;
    private Integer id;
}
