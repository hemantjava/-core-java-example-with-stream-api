package com.example.corejavaexamplewithstreamapi.adMthreading.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch waiting for complete latch associated thread . then after
 * execute rest thread.
 */
public class CountDownLatchExample {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Main Thread stared : "+Thread.currentThread().getName());
    final ExecutorService executorService = Executors.newFixedThreadPool(3);
    final  CountDownLatch latch = new CountDownLatch(2);
    executorService.execute(new DevTeam(latch,"DEV-A",4000l));
    executorService.execute(new DevTeam(latch,"DEV-B",5000L));

    latch.await();

    executorService.execute(new QATeam("QA-A",6000L));
    System.out.println("Main thread ended : "+Thread.currentThread().getName());
  }

}
