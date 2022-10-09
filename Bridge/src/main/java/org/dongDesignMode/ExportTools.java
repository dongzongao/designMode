package org.dongDesignMode;

public abstract class ExportTools {

    protected DataBase dataBase;

    public ExportTools(DataBase dataBase){
        this.dataBase = dataBase;
    }

    public abstract void exportFiles();
}