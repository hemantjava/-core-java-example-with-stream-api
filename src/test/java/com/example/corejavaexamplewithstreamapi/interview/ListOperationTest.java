package com.example.corejavaexamplewithstreamapi.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class ListOperationTest {

  @Test
  void removeNull() {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 4, 2, 5, null, 76, null));
    ListOperation.removeNull(integerList);
    System.out.println(integerList);
  }

  @Test
  void removeAllNull() {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 5, 5, null, 76, null));
    ListOperation.removeAllNull(integerList);
    System.out.println(integerList);
  }

  @Test
  void removeDuplicate() {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 5, 5, null, 76, null));
    final List<Integer> integersUp = ListOperation.removeDuplicate(integerList);
    System.out.println(integersUp);
  }
  @Test
  void removeDuplicateJava8(){
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 5, 5, null, 76, null));
    final List<Integer> integersUp = ListOperation.removeDuplicateJava8(integerList);
    System.out.println(integersUp);
  }

  @Test
  void skipLastElements() {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 4, 2, 5, 9, 76));
    System.out.println(integerList);
    final LinkedList<Integer> collect = integerList.stream().limit(integerList.size()-1)
        .collect(Collectors.toCollection(LinkedList::new));
    System.out.println(collect);
  }

}