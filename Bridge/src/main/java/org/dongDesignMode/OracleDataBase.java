package org.dongDesignMode;

public class OracleDataBase implements DataBase {
    @Override
    public void getData() {
        System.out.println("从oracle数据读取数据");
    }
}