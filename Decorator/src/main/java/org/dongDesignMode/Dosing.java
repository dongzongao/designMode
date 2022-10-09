package org.dongDesignMode;

public abstract class Dosing implements IMilktea {

    IMilktea iMilktea;

    public Dosing(IMilktea iMilktea) {
        this.iMilktea = iMilktea;
    }

    @Override
    public void addDosing() {
        this.iMilktea.addDosing();
    }
}