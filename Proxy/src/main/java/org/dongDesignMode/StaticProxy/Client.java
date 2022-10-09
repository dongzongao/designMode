package org.dongDesignMode.StaticProxy;

/**
 * 静态代理
 */
public class Client {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }
}