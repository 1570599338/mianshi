package com.lquan.jdk.dynamic.proxy;

public interface UserManager {
	
  //新增用户抽象方法
  public  void addUser(String userName,String password);
  //删除用户抽象方法
  public  void delUser(String userName);

}
