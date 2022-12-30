package com.example.corejavaexamplewithstreamapi.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOperation {

  public static void removeNull(List<Integer> integers){
    while (integers.remove(null));
  }
  public static void removeAllNull(List<Integer> integers){
    integers.removeAll(Collections.singleton(null));
  }
  public static List<Integer> removeDuplicate(List<Integer> integers){
    return new ArrayList<Integer>(new HashSet<Integer>(integers));
  }
  public static List<Integer> removeDuplicateJava8(List<Integer> integers){
    return integers.stream().distinct().collect(Collectors.toList());
  }
}
