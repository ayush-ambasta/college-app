package com.example.collegemanagementapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope(value="prototype") --------> this is used for creating object again and again for each request not same object for each request
//as good as using new keyword to initialise object
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

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
