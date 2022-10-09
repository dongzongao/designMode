package org.dongDesignMode;

public class WorkFile extends File{


    public WorkFile(String name) {
        super(name);
    }

    @Override
    public void accept(Folder folder) {
        folder.visit(this);
    }

}