package com.example.corejavaexamplewithstreamapi.interview;

// Java program to sort hashmap by values

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GFGHashMapSortByValue {

  // function to sort hashmap by values
  public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
    // Create a list from elements of HashMap list of entry
    List<Map.Entry<String, Integer>> list =
        new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

    // Sort the list
    Collections.sort(list, (m1, m2) -> {
      return m1.getValue().compareTo(m2.getValue());
    });

    // put data from sorted list to hashmap
    HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();

    list.forEach(x -> {
      temp.put(x.getKey(), x.getValue());
    });
    return temp;
  }

  // Driver Code
  public static void main(String[] args)
  {

    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    // enter data into hashmap
    hm.put("Math", 98);
    hm.put("Data Structure", 85);
    hm.put("Database", 91);
    hm.put("Java", 95);
    hm.put("Operating System", 79);
    hm.put("Networking", 80);

    Map<String, Integer> hm1 = sortByValue(hm);

    //before sort
    System.out.println(hm);
    // print the sorted hashmap
    System.out.println(hm1);
    System.out.println(
        "=================================================================================");
    //print the sorted hashmap by java 8
    System.out.println(sortByValueAscJava8(hm));
    System.out.println(
        "=================================================================================");
    //print the sorted hashmap by java 8
    System.out.println(sortByValueDescJava8(hm));
    System.out.println(
        "=================================================================================");
    //print the sorted hashmap by java 8
    System.out.println(sortByKeyAscJava8(hm));
    System.out.println(
        "=================================================================================");
    //print the sorted hashmap by java 8
    System.out.println(sortByKeyDescJava8(hm));

  }

  public static HashMap<String, Integer> sortByValueAscJava8(HashMap<String, Integer> hm) {
    return hm.entrySet()
        .stream()
        .sorted(comparingByValue())
        //.sorted((c1, c2) -> c1.getValue().compareTo(c2.getValue()))
        .collect(Collectors
            .toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
  }

  public static HashMap<String, Integer> sortByValueDescJava8(HashMap<String, Integer> hm) {
    return hm.entrySet()
        .stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        //.sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
        .collect(Collectors
            .toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
  }
  public static HashMap<String, Integer> sortByKeyAscJava8(HashMap<String, Integer> hm) {
    return hm.entrySet()
        .stream()
        .sorted(comparingByKey())
       // .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
        .collect(Collectors
            .toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
  }

  public static HashMap<String, Integer> sortByKeyDescJava8(HashMap<String, Integer> hm) {
    return hm.entrySet()
        .stream()
        .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
        //.sorted((c1, c2) -> c2.getKey().compareTo(c1.getKey()))
        .collect(Collectors
            .toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
  }
}
