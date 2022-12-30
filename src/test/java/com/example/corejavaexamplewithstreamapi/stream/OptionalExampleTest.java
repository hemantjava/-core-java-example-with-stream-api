package com.example.corejavaexamplewithstreamapi.stream;

import java.util.Collections;
import java.util.LinkedHashSet;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class OptionalExampleTest {

    List<Optional<String>> listOfOptionals = Arrays.asList(
            Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));

    @Test
    void getOptionalList () {
        Collection<Integer> number//boxed()->covert IntStream to Stream<Integer>
                = IntStream.range(0, 10).filter(x->x>=5).boxed().collect(Collectors.toCollection(
            LinkedHashSet::new));
        final List<String> list = OptionalExample.getList(listOfOptionals);
        System.out.println(list);
        System.out.println(number);
        final List<String> unmodifiableList = Collections.unmodifiableList(list);
       // unmodifiableList.add("sonu"); RTE

    }
}