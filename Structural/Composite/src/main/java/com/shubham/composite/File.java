package com.shubham.composite;

public class File implements FileSystemComponent {

    private String name;
    public File(String name) {
        this.name = name;
    }
    @Override
    public void ls() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
