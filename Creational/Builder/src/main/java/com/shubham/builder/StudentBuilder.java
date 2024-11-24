package com.shubham.builder;

public abstract class StudentBuilder {

    private int id;
    private String  firstName;
    private String lastName;
    private String email;
    private int rollNumber;

    public StudentBuilder setID(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setFirstName(String name) {
        this.firstName = name;
        return this;
    }

    public StudentBuilder setLastName(String name) {
        this.lastName = name;
        return this;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNumber = rollNo;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
