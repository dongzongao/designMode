package org.dongDesignMode;

/**
 * 桥接模式
 */
public class Client {
    public static void main(String[] args) {
        // oracle -> csv
        ExportTools exportOracleCsvTools = new ExportCsv(new OracleDataBase());
        exportOracleCsvTools.exportFiles();
        System.out.println("------------");
        //mysql -> txt
        ExportTools exportMysqlTxtTools = new ExportTxt(new MysqlDataBase());
        exportMysqlTxtTools.exportFiles();
    }
}