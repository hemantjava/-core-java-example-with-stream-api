package com.example.corejavaexamplewithstreamapi.adMthreading.cyclicbarrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import lombok.SneakyThrows;

public class Passenger implements Runnable {

  private final CyclicBarrier barrier;
  private final String name;
  private final Long timeTaken;

  public Passenger(CyclicBarrier barrier, String name, Long timeTaken) {
    this.barrier = barrier;
    this.name = name;
    this.timeTaken = timeTaken;
  }

  @SneakyThrows
  @Override
  public void run() {
    Thread.currentThread().setName(name);
    Thread.sleep(timeTaken);
    System.out.println("Passenger thread arrived : "+Thread.currentThread().getName());
    final int await = barrier.await();//waiting for count become 0.
    if (await == 0)
    System.out.println("Passengers threads waiting time ended cab ca proceed further..");

  }
}
