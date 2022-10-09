package org.dongDesignMode.dynamicProxy;

/**
 * 1.动态代理是指代理类对象在程序运行时由JVM根据反射机制动态生成的。动态代理不需要定义代理类的，java源文件。
 * 2.动态代理其实就是jdk运行期间，动态创建class字节码并加载到JVM。
 * 3.动态代理的实现方式常用的有两种：使用JDK代理，与通过CGLlB动态代理。
 * 动态代理
 */
public class Client {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        System.out.println("目标对象信息：" + target.getClass());
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getInstance();
        System.out.println("代理对象信息：" + proxy.getClass());
        proxy.save();
    }
}