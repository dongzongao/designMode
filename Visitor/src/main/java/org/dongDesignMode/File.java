package org.dongDesignMode;

public abstract class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //接收
    public abstract void accept(Folder folder);
}