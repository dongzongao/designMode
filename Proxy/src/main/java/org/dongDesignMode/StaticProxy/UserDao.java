package org.dongDesignMode.StaticProxy;

public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("保存数据");
    }
}