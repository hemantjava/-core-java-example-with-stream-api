package com.example.corejavaexamplewithstreamapi.adMthreading.countdownlatch;

import java.util.concurrent.CountDownLatch;
import lombok.SneakyThrows;

public class DevTeam implements Runnable {

  private final CountDownLatch latch;
  private final String name;
  private final Long timeTaken;

  public DevTeam(CountDownLatch latch, String name,Long timeTaken) {
    this.name = name;
    this.latch = latch;
    this.timeTaken = timeTaken;

  }

  @SneakyThrows
  @Override
  public void run() {
    Thread.currentThread().setName(name);
    System.out.println("DevTeam thread started : "+Thread.currentThread().getName());
    Thread.sleep(timeTaken);
    System.out.println("DevTeam thread ended : "+Thread.currentThread().getName()+" After :"+timeTaken+" ms");
    latch.countDown();
  }
}
