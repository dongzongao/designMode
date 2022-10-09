package org.dongDesignMode;

public class Ice extends Dosing {

    public Ice(IMilktea iMilktea) {
        super(iMilktea);
    }

    @Override
    public void addDosing() {
        super.addDosing();
        System.out.println("制作中：加冰");
    }
}