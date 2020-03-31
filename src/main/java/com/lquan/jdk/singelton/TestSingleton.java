package com.lquan.jdk.singelton;

import java.util.concurrent.atomic.AtomicInteger;

public class TestSingleton {

	public static void main(String[] args) {
		//System.out.println(EnumSingletonDemo.INSTANCE);
		//EnumSingletonDem.
		
		AtomicInteger a = new AtomicInteger(0);
		a.incrementAndGet();

	}

}
