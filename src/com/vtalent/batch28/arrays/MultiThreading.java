package com.vtalent.batch28.arrays;

import java.util.concurrent.*;

public class MultiThreading implements Callable {



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MultiThreading mt1=new MultiThreading();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1;i<=15;i++){
            Future submit = executorService.submit(mt1);
            System.out.println(submit.get().toString());
        }
        executorService.shutdown();


    }

    @Override
    public Object call() throws Exception {
        System.out.println("Call() method excecyted");
        return "success";
    }
}
