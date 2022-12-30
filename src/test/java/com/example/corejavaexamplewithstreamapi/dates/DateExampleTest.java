package com.example.corejavaexamplewithstreamapi.dates;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

class DateExampleTest {

    @Test
    void specificDate(){
        final LocalDate date = LocalDate.of(2020, 11, 6);
        System.out.println(date);
        final LocalDate plusDays = date.plusDays(90);
        System.out.println(plusDays);
    }

    @Test
    void period(){
        final LocalDate date = LocalDate.of(2020, 11, 6);
        LocalDate now = LocalDate.now();
        final Period between = Period.between(date, now);
        System.out.println(between.getYears());
        System.out.println(between.getDays());
        System.out.println(between.getMonths());

    }

    @Test
    void experience(){
        final LocalDate f1 = LocalDate.of(2016, Month.APRIL, 13);
        final LocalDate f2 =  LocalDate.of(2016, Month.SEPTEMBER, 29);
        final Period between1 = Period.between(f1, f2);
        final LocalDate s1 = LocalDate.of(2016, Month.DECEMBER, 15);
        final LocalDate s2 = LocalDate.of(2017, Month.DECEMBER, 15);
        final Period between2 = Period.between(s1, s2);
        final LocalDate t1 = LocalDate.of(2018, Month.MARCH, 5);
        final LocalDate t2 = LocalDate.of(2018, Month.AUGUST, 8);
        final Period between3 = Period.between(t1, t2);
        final LocalDate x1 = LocalDate.of(2018, Month.AUGUST, 13);
        final LocalDate x2 = LocalDate.of(2021, Month.FEBRUARY, 3);
        final Period between4 = Period.between(x1, x2);
        System.out.println(between1.getYears()+between2.getYears()+between3.getYears()+between4.getYears());
        System.out.println(between1.getMonths()+between2.getMonths()+between3.getMonths()+between4.getMonths());
        System.out.println(between1.getDays()+between2.getDays()+between3.getDays()+between4.getDays());





    }

}