package org.dongDesignMode;

/**
 * 外观模式
 */
public class Client {
    public static void main(String[] args) {
        StopEquipment stopEquipment = new StopEquipment();
        System.out.println("执行关闭所有设备接口");
        stopEquipment.executeStopAll();
        System.out.println("----------------");
        System.out.println("执行关闭音响接口");
        stopEquipment.executeStopSound();
    }
}