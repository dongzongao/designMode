package org.dongDesignMode;

public class ExportCsv extends ExportTools {

    public ExportCsv(DataBase dataBase) {
        super(dataBase);
    }

    @Override
    public void exportFiles() {
        this.dataBase.getData();
        System.out.println("导出csv文件");
    }
}