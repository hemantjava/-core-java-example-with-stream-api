package com.example.corejavaexamplewithstreamapi.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class DateFormatExample {

  @Test
  void format() {
    DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
    final LocalDateTime localDateTime = LocalDateTime.parse("2020-09-11T18:28:47Z", inputFormatter);
    String formattedDate = inputFormatter.format(localDateTime);
    System.out.println(formattedDate);

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");//support MM/dd/yyyy
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    final LocalDate parse = LocalDate.parse("9/22/2001", dateFormat);
    final LocalDate parse1 = LocalDate.parse("12/22/2001", dateFormat);
    System.out.println(parse);
    System.out.println(parse1);

  }

  @Test
  void tt(){


  }

}
