package com.example.corejavaexamplewithstreamapi.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class ArraysExample {

  @Test
  void ListToArray() {
    List<String> movies = Arrays.asList("Captain America", "Avatar", "Harry Potter");
    String[] arrayOfMovies = new String[movies.size()];
    movies.toArray(arrayOfMovies);
    System.out.println("list of String : " + movies);
    for (int i = 0; i < arrayOfMovies.length; i++) {
      System.out.println(arrayOfMovies[i]);
    }
  }

  @Test
  void sortArray() {
    Integer[] cubes = new Integer[]{8, 271, 64, 12, 26};
    Arrays.sort(cubes);
    System.out.println(Arrays.toString(cubes));
  }

  @Test
  void arrayToList() {
    String[] colors = {"R", "B", "G"};
    //using stream api
    final List<String> collect = Arrays.stream(colors).collect(Collectors.toList());
    System.out.println(collect.getClass());//ArrayLsi
    System.out.println(collect);
    //Converting LinkedList object
    final List<String> collect1 = Arrays.stream(colors).collect(Collectors.toCollection(LinkedList::new));
    System.out.println(collect1.getClass());//LinkedList
    System.out.println(collect1);
  }

  @Test
  void sortDescArray() {
    Integer[] cubes = new Integer[]{8, 271, 64, 12, 26};
    Arrays.sort(cubes, Collections.reverseOrder());
    System.out.println(Arrays.toString(cubes));
  }

  @Test
  void tests() {
    Map<String, Integer> map = new HashMap();
    String a = "Hemant";
    String b = new String(a);
    int val = 0;
    val = (a==b)?1:2;
    if (val == 1)
      System.out.println("Hemant");
      else if (val == 2)
        System.out.println("Hemant sahu");
        else
        System.out.println("ooojib kjhkjh");
      }
    }


