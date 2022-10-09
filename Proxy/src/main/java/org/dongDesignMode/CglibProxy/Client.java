package org.dongDesignMode.CglibProxy;

/**
 * 1.JDK动态代理必须实现InvocationHandler接口，通过反射代理方法。cglib代理无需实现接口，
 * JDK动态代理必须实现InvocationHandler接口，通过反射代理方法。cglib代理无需实现接口，通过生成类字节码实现代理，比反射稍快，但cglib会继承目标对象，需要重写方法，所以目标对象不能为final类。通过生成类字节码实现代理，比反射稍快，但cglib会继承目标对象，需要重写方法，所以目标对象不能为final类。
 */
public class Client {
    public static void main(String[] args) {
        UserDao userDaoProxy = (UserDao) new ProxyFactory(new UserDao()).getProxyInstance();
        userDaoProxy.save();
    }
}