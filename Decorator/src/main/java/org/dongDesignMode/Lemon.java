package org.dongDesignMode;

public class Lemon extends Dosing {
    public Lemon(IMilktea iMilktea) {
        super(iMilktea);
    }

    @Override
    public void addDosing() {
        super.addDosing();
        System.out.println("制作中：加柠檬");
    }
}