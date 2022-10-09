package org.dongDesignMode;

public class StudyFile extends File{


    public StudyFile(String name) {
        super(name);
    }

    @Override
    public void accept(Folder folder) {
        folder.visit(this);
    }

}

