package org.dongDesignMode;



public class StudyFolder implements Folder{
    @Override
    public void visit(File file) {
        if(file instanceof StudyFile){
            System.out.println("[学习资料文件夹]下，已找到  "+ file.getName());
        }
    }

}
