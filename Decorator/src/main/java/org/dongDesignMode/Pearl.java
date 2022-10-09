package org.dongDesignMode;

public class Pearl extends Dosing {

    public Pearl(IMilktea iMilktea) {
        super(iMilktea);
    }

    @Override
    public void addDosing() {
        super.addDosing();
        System.out.println("制作中：加珍珠");
    }
}