package com.example.corejavaexamplewithstreamapi.adMthreading.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
1.FixedThreadPool
2.CachedThreadPool
3.ScheduledThreadPool
4.SingleThreadExecutor
 */
public class ExecutableFrameworkExample {

  private static Runnable runnable = () -> {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(1000);
        System.out.println("Task  +"+i+"+:-" + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        System.out.println("Occurred InterruptedException");
      }
    }
  };
  private static Runnable runnable2 = () -> {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(2000);
        System.out.println("Task  +"+i+"+:-" + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        System.out.println("Occurred InterruptedException");
      }
    }
  };
  private static Runnable runnable1 = () -> {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(1000);
        System.out.println("Task  +"+i+"+:-" + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        System.out.println("Occurred InterruptedException");
      }
    }
  };

  private static  Callable callable = () -> {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(1000);
        System.out.println("Task  +"+i+"+:-" + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        System.out.println("Occurred InterruptedException");
      }
    }
    return 10;
  };
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    //find available processors
    final int processors = Runtime.getRuntime().availableProcessors();
    System.out.println("processors :" + processors);
    final ExecutorService executorService = Executors.newFixedThreadPool(processors);
    final long l = System.currentTimeMillis();
    threadPool(executorService);
    //normal();
  }

  static void threadPool(ExecutorService executorService)
      throws ExecutionException, InterruptedException {
     executorService.submit(runnable);
    executorService.submit(runnable1);
    executorService.submit(runnable2);
    final Future submit = executorService.submit(callable);
      System.out.println(submit.get());
    executorService.shutdownNow();

  }

  static void normal(){
    runnable2.run();
    runnable2.run();
    runnable2.run();
  }

}
