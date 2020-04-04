package com.lquan.jdk.singelton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExectuTestDemo {

	public static void main(String[] args) {
		ExecutorService aa = Executors.newFixedThreadPool(2);
		Executors.newCachedThreadPool();
		Executors.newSingleThreadExecutor();
		Executors.newScheduledThreadPool(10);
		Thread[] tt =new Thread[20];
		for (int i = 0; i < 20; i++) {
			aa.execute(new Runnable() {
				@Override
				public void run() {
					
					System.out.println(Thread.currentThread().getName()+"***");
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}

	}

}
