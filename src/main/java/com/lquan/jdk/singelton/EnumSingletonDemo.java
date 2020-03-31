package com.lquan.jdk.singelton;

public enum EnumSingletonDemo {
	
	INSTANCE;
	
	EnumSingletonDemo(){
		System.out.println("********************");
	}
	public EnumSingletonDemo getInstance()	{
		return INSTANCE;
	}

}
