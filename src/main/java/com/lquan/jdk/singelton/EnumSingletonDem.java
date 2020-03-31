package com.lquan.jdk.singelton;

public class EnumSingletonDem {
	
	private EnumSingletonDem() {
		
	}
	
	
	private enum EnumHolder {
		INSTANCE;
		
		private EnumSingletonDem instance;
		
		EnumHolder(){
			System.out.println("********************");
			this.instance = new EnumSingletonDem();
		}
		
		
		private EnumSingletonDem getInstance() {
			
			return instance;
		}
		
		
	}
	
	public static EnumSingletonDem getInstance() {
		
		return EnumHolder.INSTANCE.instance;
	}
	

}
