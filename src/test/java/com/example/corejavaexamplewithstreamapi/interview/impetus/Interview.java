package com.example.corejavaexamplewithstreamapi.interview.impetus;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Interview {
    //Print today's DateTime in the following format: Oct 23 2020 02:59 PM
    @Test
    void dateFormat ( ) {
        final LocalDateTime localDateTime = LocalDateTime.now();      //HH:mm  ->24 hrs
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm a");
        System.out.println(dateTimeFormatter.format(localDateTime));
    }

    /*
     Create a list of random names,
     and print the names of those employees whose names start with letter "B",
      also sort the names. Use Stream.
      */
    @Test
    void testStream ( ) {
        List<String> nameList = Arrays.asList(
                "hemant",
                "Bindu",
                "sonu",
                "Babita");

        final List<String> strings = nameList.stream().filter(name -> name.startsWith("B")).sorted().collect(Collectors.toList());
        System.out.println(strings);
    }

    /*
Create a callable task that runs for 60 seconds and returns an integer.
Create an ExecutorService with a fixed pool of 1 thread,
 that runs this task and print the returned integer. If waiting time more than
 6 second throws exception
     */
    @Test
    void testFuture ( ) {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        final Future<Integer> submit = executorService.submit(( ) -> {
            Thread.sleep(1000 * 7);
            return 1;
        });
        try {
            System.out.println("result:-" + submit.get(6, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
}
