package org.dongDesignMode;


public class WorkFolder implements Folder {
    @Override
    public void visit(File file) {
        if (file instanceof WorkFile) {
            System.out.println("[工作文件夹]下，已找到  " + file.getName());
        }
    }
}