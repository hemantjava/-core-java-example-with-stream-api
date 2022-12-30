package com.example.corejavaexamplewithstreamapi.adMthreading.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example {


    public static void main (String[] args) throws ExecutionException, InterruptedException {
        final long l = System.currentTimeMillis();
        System.out.println("Main thread started :"+Thread.currentThread().getName());
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        final Future<Integer> s1 = executorService.submit(( ) -> {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return 10;
        });
        final Integer i1 = s1.get();//block others
        final Future<Integer> s2 = executorService.submit(( ) -> {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return 10;
        });
        final Integer i2 = s2.get();//block others
        final Future<Integer> s3 = executorService.submit(( ) -> {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return 10;
        });
        final Integer i3 = s3.get();//block others
        final Future<Integer> s4 = executorService.submit(( ) -> {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return 10;
        });
        final Integer i4 = s4.get();//block others
        final int sum = i1 + i2 + i3 + i4;
        System.out.println("sum: "+sum);
        final long r = System.currentTimeMillis();
        System.out.println("Main thread ended:"+Thread.currentThread().getName()+"  timing:"+(r-l));
    }
}
