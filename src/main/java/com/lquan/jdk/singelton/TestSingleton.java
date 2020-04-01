package com.lquan.jdk.singelton;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class TestSingleton {

	public static void main(String[] args) {
		//System.out.println(EnumSingletonDemo.INSTANCE);
		//EnumSingletonDem.
		
		AtomicInteger a = new AtomicInteger(0);
		a.incrementAndGet();
		
		AtomicStampedReference  aa = new AtomicStampedReference(100, 1);
		System.out.println(aa.compareAndSet(100, 100, aa.getStamp(), aa.getStamp()));
		
		System.out.println(aa.getReference()+"*********"+aa.getStamp());
		
		
		// ================== AQS =================
		AbstractQueuedSynchronizer

	}

}
