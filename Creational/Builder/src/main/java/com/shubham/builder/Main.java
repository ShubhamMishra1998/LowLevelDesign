package com.shubham.builder;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new ConcreteStudentBuilder();
        studentBuilder.setID(1);
        studentBuilder.setFirstName("Shubham");
        studentBuilder.setLastName("Mishra");
        studentBuilder.setRollNo(123);
        studentBuilder.setEmail("FkTb5@example.com");
        Student student = studentBuilder.build();
        System.out.println(student);
    }
}
