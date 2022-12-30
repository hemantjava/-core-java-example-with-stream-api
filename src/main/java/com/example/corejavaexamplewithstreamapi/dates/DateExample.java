package com.example.corejavaexamplewithstreamapi.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExample {

    public static void main (String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
      /*  System.out.println("localDateTime:"+localDateTime);
        System.out.println("LocalDate"+localDate);
        System.out.println("localTime"+localTime);*/
        
        DateTimeFormatter inFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter inFormatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter outFormat = DateTimeFormatter.ofPattern("EEE, MMM d yyyy, KK:mm a");

        System.out.println(inFormat.format(localDateTime));
        System.out.println(inFormatDate.format(localDateTime));
        System.out.println(outFormat.format(localDateTime));

    }
}
