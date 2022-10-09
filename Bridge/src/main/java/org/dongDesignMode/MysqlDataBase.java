package org.dongDesignMode;

public class MysqlDataBase implements DataBase {
    @Override
    public void getData() {
        System.out.println("从mysql数据读取数据");
    }
}