package com.example.corejavaexamplewithstreamapi.interview;

import java.util.List;

public class FindSumOfAge {

  public static int getSum(List<Employee> empList) {
    //              Stream of Employee   Stream of age      IntStream                 int
    final int sum = empList.stream().map(Employee::getAge).mapToInt(Integer::intValue).sum();
    return sum;

  }

  public static double getAverage(List<Employee> empList) {                                  //OptionalDouble double
    final double asDouble = empList.stream().map(Employee::getAge).mapToInt(Integer::intValue).average().getAsDouble();
    return asDouble;

  }

  public static int getMax(List<Employee> empList) {              //OptionalInt    int
    final int asInt = empList.stream().map(Employee::getAge).max((a,b)->a).get();
    return asInt;

  }

  public static int getMin(List<Employee> empList) {
    final int asInt = empList.stream().map(Employee::getAge).mapToInt(Integer::intValue).min().getAsInt();
    return asInt;

  }

  public static int getCount(List<Employee> empList) {
    //          Down casting                                                                  long
    final int count = (int)empList.stream().map(Employee::getId).mapToInt(Integer::intValue).count();
    return count;

  }

}
