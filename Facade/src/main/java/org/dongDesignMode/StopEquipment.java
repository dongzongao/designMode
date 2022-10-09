package org.dongDesignMode;

public class StopEquipment {

    StopMonitor stopMonitor;
    StopSound stopSound;
    StopHost stopHost;

    public StopEquipment(){
        this.stopHost = new StopHost();
        this.stopMonitor = new StopMonitor();
        this.stopSound = new StopSound();
    }

    public void executeStopAll(){
        stopSound.execute();
        stopMonitor.execute();
        stopHost.execute();
        System.out.println("已关闭所有设备");
    }

    public void executeStopSound(){
        stopSound.execute();
        System.out.println("仅关闭了音响设备");
    }

}