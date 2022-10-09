package org.dongDesignMode;

/**
 * 策略示例
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new BicycleStrategy());
        context.go();

        Context context1 = new Context(new BusStrategy());
        context1.go();

        Context context2 = new Context(new TaxiStrategy());
        context2.go();
    }
}