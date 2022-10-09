package org.dongDesignMode;

/**
 * 装饰器设计模式
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("服务员：你好，需要点什么呀？");
        System.out.println("我: 一杯加芒果、加珍珠的珍珠奶茶，一杯加柠檬、加冰的柠檬水");
        System.out.println("服务员：好的。");
        System.out.println("---------------------------");
        PearlMilktea pearlMilktea = new PearlMilktea();
        Pearl pearl = new Pearl(pearlMilktea);
        Mango mango = new Mango(pearl);
        Ice ice = new Ice(mango);
        ice.addDosing();
        System.out.println("-------第一杯制作完成----------");
        LemonMilktea lemonMilktea = new LemonMilktea();
        Lemon lemon = new Lemon(lemonMilktea);
        Ice ice1 = new Ice(lemon);
        ice1.addDosing();
        System.out.println("-------第二杯制作完成----------");
        System.out.println("我：珍珠奶茶怎么加冰了？");
        System.out.println("服务员：对不起，珍珠奶茶做错了，重新给您做。");
        System.out.println("---------------------------");
        mango.addDosing();
        System.out.println("-------不加冰的珍珠奶茶制作完成----------");
        System.out.println("我：好的，谢谢！");
    }
}