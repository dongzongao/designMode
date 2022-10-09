package org.dongDesignMode;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    List<File> list = new ArrayList<>();

    public void add(File file) {
        list.add(file);
    }

    public void action(Folder folder) {
        for (File file : list) {
            file.accept(folder);
        }
    }

}