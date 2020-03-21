package com.lquan.jdk.dynamic.proxy;

public class UserManagerImpl implements UserManager {

	 //重写用户新增方法
    @Override
    public void addUser(String userName, String password) {
        System.out.println("调用了用户新增的方法！");
        System.out.println("传入参数：\nuserName = " + userName +", password = " + password);
    }
 
    //重写删除用户方法
    @Override
    public void delUser(String userName) {
        System.out.println("调用了删除的方法！");
        System.out.println("传入参数：\nuserName = "+userName);
    }

}
