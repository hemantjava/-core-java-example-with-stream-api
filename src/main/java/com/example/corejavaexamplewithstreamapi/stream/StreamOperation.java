package com.example.corejavaexamplewithstreamapi.stream;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperation {

  public static Set<Integer> removeDuplicate(List<Integer> integers){
    return new HashSet<>(integers);
  }

  public static List<Integer> removeDuplicateByDistinct(List<Integer> integers){
    return integers.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
  }

}
