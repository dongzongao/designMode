package org.dongDesignMode;

public class BusStrategy implements Strategy{
    @Override
    public void goHome() {
        System.out.println("省钱省力，坐公交回家");
    }
}
