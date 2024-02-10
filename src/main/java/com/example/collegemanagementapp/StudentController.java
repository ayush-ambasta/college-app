package com.example.collegemanagementapp;

import org.springframework.web.bind.annotation.*;



@RestController
public class StudentController {

    StudentService studentService=new StudentService();

    @PostMapping("/student/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/student/get")
    public Student getStudent(@RequestParam("id") int id){
        return studentService.getStudent(id);
    }

    @GetMapping("/student/get/{name}/{q}")
    public Student getStudentByName(@PathVariable("name") String name){
        return studentService.getStudentByName(name);
    }

}
