package com.example.collegemanagementapp;

import java.util.HashMap;
import java.util.Map;

public class StudentRepo {
    Map<Integer,Student> studentDb=new HashMap<>();

    public String addStudent(Student student) {
        if(studentDb.containsKey(student.getId())){
            return "Student Already Registered";
        }
        studentDb.put(student.getId(),student);
        return "Student Registered Successfully";
    }

    public Student getStudent(int id) {
        return studentDb.get(id);
    }

    public Student getStudentByName(String name) {
        for(Integer x: studentDb.keySet()){
            if(studentDb.get(x).getName().equals(name)){
                return studentDb.get(x);
            }
        }
        return null;
    }
}
