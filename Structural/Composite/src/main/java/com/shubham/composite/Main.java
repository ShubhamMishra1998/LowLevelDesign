package com.shubham.composite;

public class Main {

    public static void main(String[] args) {
        DirectoryComposite root = new DirectoryComposite("root");
        FileSystemComponent file1 = new File("thor");
        root.add(file1);
        DirectoryComposite dir1 = new DirectoryComposite("comedy movies");
        FileSystemComponent comedy1 = new File("hera pheri");
        FileSystemComponent comedy2 = new File("hera pheri 2");
        dir1.add(comedy1);
        dir1.add(comedy2);

        root.add(dir1);

        root.ls();
    }
}
