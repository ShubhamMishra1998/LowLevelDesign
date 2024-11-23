package com.shubham.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements FileSystemComponent {
    private final List<FileSystemComponent> components;

    private String dirName;

    public DirectoryComposite(String dirName) {
        components = new ArrayList<>();
        this.dirName = dirName;
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + dirName);
        components.forEach(FileSystemComponent::ls);
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }
}
