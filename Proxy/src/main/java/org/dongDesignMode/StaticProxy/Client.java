package org.dongDesignMode.StaticProxy;

/**
 * ้ๆไปฃ็
 */
public class Client {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }
}