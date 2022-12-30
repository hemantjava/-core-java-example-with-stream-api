package com.example.corejavaexamplewithstreamapi.adMthreading.executor;

import static java.lang.Thread.sleep;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import lombok.SneakyThrows;

public class ExecutorExample {


  public static void main(String[] args) throws ExecutionException, InterruptedException {
    System.out.println("Main method started");
    final ExecutorService service = Executors.newFixedThreadPool(2);
    final Future<String> future = service.submit(() -> {
      System.out.println("child method started "+Thread.currentThread().getName());
      for (int i = 0; i < 100; i++) {
        try {
          sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.print(" " + i);
      }
      System.out.println("\nchild method started "+Thread.currentThread().getName());
      return "hemant";
    });
    final String name = future.get();//get() blocking main()
    service.shutdown();//shutdown ExecutorService
    System.out.println("welcome: "+name);

    System.out.println("Main method ended");

  }

}
