package com.example.corejavaexamplewithstreamapi.adMthreading.executor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownNowExample {

  public static void main(String[] args) {
    final ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.submit(runnable);
    executorService.submit(runnable);
    executorService.submit(runnable);
    executorService.submit(runnable);


    System.out.println("End main method.");


  }

  static Runnable runnable = ()->{
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(i+" "+Thread.currentThread().getName());
    }
  };

}
