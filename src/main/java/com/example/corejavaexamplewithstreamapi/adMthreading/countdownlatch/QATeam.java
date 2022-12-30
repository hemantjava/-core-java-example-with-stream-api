package com.example.corejavaexamplewithstreamapi.adMthreading.countdownlatch;

import lombok.SneakyThrows;

public class QATeam implements Runnable{
  private final String name;
  private final Long timeTaken;
  public QATeam(String name,Long timeTaken) {
    this.name = name;
    this.timeTaken = timeTaken;
  }

  @SneakyThrows
  @Override
  public void run() {
    Thread.currentThread().setName(name);
    System.out.println("QATeam thread started : " + Thread.currentThread().getName());
    Thread.sleep(timeTaken);
    System.out.println("QATeam thread ended : " + Thread.currentThread().getName()+" After :"+timeTaken+" ms");
  }
}
