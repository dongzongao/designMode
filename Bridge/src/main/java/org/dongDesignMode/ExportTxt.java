package org.dongDesignMode;

public class ExportTxt extends ExportTools {

    public ExportTxt(DataBase dataBase) {
        super(dataBase);
    }

    @Override
    public void exportFiles() {
        this.dataBase.getData();
        System.out.println("导出txt文件");
    }
}