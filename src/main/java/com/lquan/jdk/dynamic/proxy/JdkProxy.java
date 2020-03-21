package com.lquan.jdk.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * JDK动态代理实现InvocationHandler接口
 */
public class JdkProxy implements InvocationHandler {
	
	private static Object targetObject;  //需要代理的目标对象

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		// 调用invoke方法，result存储该方法的返回值
		Object result = method.invoke(targetObject, args);
		
		
		return result;
	}


  public static void main(String[] args) {
      JdkProxy jdkProxy = new JdkProxy();  //实例化JDKProxy对象
      targetObject = new UserManagerImpl();
      UserManager user = (UserManager)Proxy.newProxyInstance(UserManagerImpl.class.getClassLoader(), UserManagerImpl.class.getInterfaces(), jdkProxy);
      
     // UserManager user = (UserManager) jdkProxy.getJDKProxy(new UserManagerImpl());   //获取代理对象
      user.addUser("admin","123456");
      
  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
