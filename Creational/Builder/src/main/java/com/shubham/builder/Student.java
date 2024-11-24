package com.shubham.builder;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int rollNumber;



    public Student() {

    }

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.email = studentBuilder.getEmail();
        this.rollNumber = studentBuilder.getRollNumber();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
