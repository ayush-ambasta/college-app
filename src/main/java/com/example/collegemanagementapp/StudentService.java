package com.example.collegemanagementapp;



public class StudentService {

    StudentRepo studentRepo=new StudentRepo();

    public String addStudent(Student student) {
        return studentRepo.addStudent(student);
    }

    public Student getStudent(int id){
        return studentRepo.getStudent(id);
    }

    public Student getStudentByName(String name) {
        return studentRepo.getStudentByName(name);
    }
}
