package org.dongDesignMode;
public class TaxiStrategy implements Strategy{
    @Override
    public void goHome() {
        System.out.println("公司报销，乘坐出租车回家");
    }
}
