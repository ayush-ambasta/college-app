package com.example.collegemanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/student/get")
    public Student getStudent(@RequestParam("id") int id){
        return studentService.getStudent(id);
    }

    @GetMapping("/student/get/{name}")
    public Student getStudentByName(@PathVariable("name") String name){
        return studentService.getStudentByName(name);
    }

}
