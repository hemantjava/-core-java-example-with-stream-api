package com.example.corejavaexamplewithstreamapi.adMthreading.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

  public static void main(String[] args) {
    final CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
    final ExecutorService executorService = Executors.newFixedThreadPool(4);
    System.out.println("Main Thread stared : "+Thread.currentThread().getName());
    executorService.execute(new Passenger(cyclicBarrier,"hemant",5000l));
    executorService.execute(new Passenger(cyclicBarrier,"kumar",4000l));
    executorService.execute(new Passenger(cyclicBarrier,"sahu",6000l));
    executorService.execute(new Passenger(cyclicBarrier,"sonu",5000l));

    executorService.execute(new Passenger(cyclicBarrier,"sarita",5000l));
    executorService.execute(new Passenger(cyclicBarrier,"shaw",4000l));
    executorService.execute(new Passenger(cyclicBarrier,"sangita",6000l));
    executorService.execute(new Passenger(cyclicBarrier,"bada",5000l));
    System.out.println("Main Thread ended : "+Thread.currentThread().getName());

  }


}
