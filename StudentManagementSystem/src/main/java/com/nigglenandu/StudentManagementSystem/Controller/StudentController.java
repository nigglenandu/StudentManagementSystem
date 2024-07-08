package com.nigglenandu.StudentManagementSystem.Controller;

import com.nigglenandu.StudentManagementSystem.Entity.Student;
import com.nigglenandu.StudentManagementSystem.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private IStudentService service;

    @PostMapping("/Student")
    public Student registerStudent(@RequestBody Student student){
    Student st = service.saveStudent(student);
    return st;
}
}
