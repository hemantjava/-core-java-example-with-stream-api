package com.example.corejavaexamplewithstreamapi.adMthreading.future;

import java.util.concurrent.*;

public class Example1 {


    public static void main (String[] args) throws ExecutionException, InterruptedException {
        final long l = System.currentTimeMillis();
        System.out.println("Main thread started :"+Thread.currentThread().getName());
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        final Future<Integer> s1 = executorService.submit(( ) -> {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return 10;
        });

        final Future<Integer> s2 = executorService.submit(( ) -> {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return 10;
        });
        final Future<Integer> s3 = executorService.submit(( ) -> {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return 10;
        });
        final Future<Integer> s4 = executorService.submit(( ) -> {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return 10;
        });
        final long r = System.currentTimeMillis();
        System.out.println("Main thread ended:"+Thread.currentThread().getName()+"  timing:"+(r-l));
    }
}
