package com.lquan.jdk.singelton;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestDemo {
	
    public static void main(String[] args) {

//      BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
//        ThreadFactory factory = r -> new Thread(r, "test-thread-pool");
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5,
//                0L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), factory);
//        while (true) {
//            executor.submit(() -> {
//                try {
//                    System.out.println(queue.size());
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
    }

}
