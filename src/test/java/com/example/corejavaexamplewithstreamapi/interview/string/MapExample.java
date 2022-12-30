package com.example.corejavaexamplewithstreamapi.interview.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MapExample {

  @Test
  void test() {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 2);
    map.put("Z", 1);
    map.put("D", 5);
    System.out.println(map);
    final LinkedHashMap<String, Integer> collect = map.entrySet().stream()
        .sorted(Entry.comparingByValue())
        .collect(
            Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    System.out.println(collect);

    //Alternate ways
    Map<String, Integer> result2 = new LinkedHashMap<>();
    map.entrySet().stream()
        .sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
        .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
    System.out.println(result2);
  }

  }
