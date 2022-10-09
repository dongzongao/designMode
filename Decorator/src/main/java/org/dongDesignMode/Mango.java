package org.dongDesignMode;

public class Mango extends Dosing {

    public Mango(IMilktea iMilktea) {
        super(iMilktea);
    }

    @Override
    public void addDosing() {
        super.addDosing();
        System.out.println("制作中：加芒果");
    }
}