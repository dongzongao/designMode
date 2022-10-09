package org.dongDesignMode;



public class BicycleStrategy implements Strategy{
    @Override
    public void goHome() {
        System.out.println("为了省钱，骑自行车回家");
    }
}