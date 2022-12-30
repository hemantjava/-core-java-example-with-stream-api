package com.example.corejavaexamplewithstreamapi.competable.future;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

//  ForkJoinPool.commonPool();  CompletableFuture internally used
class ExampleTest {

    @Test
    void complete ( ) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<>();
        future.complete("Sonu");//manually call
        final String result = future.get();
        System.out.println(result);
    }

    @Test
    void runAsync ( ) throws ExecutionException, InterruptedException {
                                                            //Runnable passed
        final CompletableFuture<Void> future = CompletableFuture.runAsync(( ) -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Hemant");
        });
        future.get();//whenever we call get method it will print
    }

    @Test
    void runAsyncWithExecutor ( ) throws ExecutionException, InterruptedException {
        Executor  executor = Executors.newFixedThreadPool(12);
        //Runnable passed
        final CompletableFuture<Void> future = CompletableFuture.runAsync(( ) -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Hemant");
        },executor);
        future.get();//whenever we call get method it will print
    }

    @Test
    void supplyAsync ( ) throws ExecutionException, InterruptedException {
        //  Supplier return some value
        final CompletableFuture<String> future = CompletableFuture.supplyAsync(( ) -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hemant";
        });
        final String result = future.get();
        System.out.println(result);
    }
    @Test
    void supplyAsyncWithExecutor ( ) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(14);
                                                                //  Supplier
        final CompletableFuture<String> future = CompletableFuture.supplyAsync(( ) -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hemant";
        },service);
        final String result = future.get();
        System.out.println(result);
    }


    //thenApply return CompletableFuture 
    @Test
    void thenApply() throws ExecutionException, InterruptedException {
        final CompletableFuture<String> future = CompletableFuture.supplyAsync(( ) -> {
            return "Hemant";
            //CompletableFuture
        }).thenApply(name -> {
            return "Hello: " + name;
        }).thenApply(greeting -> {
            return greeting + " welcome to java";
        });

        final String result = future.get();
        System.out.println(result);
    }

    @Test
    void thenAccept() throws ExecutionException, InterruptedException {
        final CompletableFuture<Void> future = CompletableFuture.supplyAsync(( ) -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "sarita";
        }).thenAccept(str -> {
            System.out.println(str + " , Hi ");
        });
        future.get();
    }

    @DisplayName("Combining two CompletableFuture together")
    @Test
    void thenCompose() throws ExecutionException, InterruptedException {
        final CompletableFuture<String> future = userId(12).thenCompose(id -> userName("sonu"));
        final String result = future.get();
        System.out.println(result);
    }

    private CompletableFuture<Integer> userId(Integer id){
        return CompletableFuture.supplyAsync(()->{
            return id;
        });
    }
    private CompletableFuture<String> userName(String name){
        return CompletableFuture.supplyAsync(()->{
            return name;
        });
    }

}