package org.dongDesignMode;

/**
 * 访问者模式（Visitor Pattern）是一个行为模式，封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新操作。
 * 访问者模式主要解决的一个问题就是不用区分元素是哪种，而根据访问者的不同信息返回相应的信息，就好比文件夹中有文件，通过访问者的信息来判断你属于哪个文件夹。并也不用改变原有结构而很容易就实现了这种区别。
 * 访问者模式在23个设计模式中，算是比较复杂而且晦涩难懂些。
 */
public class client {
    public static void main(String[] args) {
        File studyFile = new StudyFile("Python学习资料");
        File workFile = new WorkFile("旅游项目文件");
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(studyFile);
        objectStructure.add(workFile);
        Folder studyFolder = new StudyFolder();
        Folder workFolder = new WorkFolder();
        objectStructure.action(studyFolder);
        objectStructure.action(workFolder);
    }
}