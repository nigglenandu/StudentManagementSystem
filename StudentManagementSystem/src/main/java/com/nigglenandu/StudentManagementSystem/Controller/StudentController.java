package com.nigglenandu.StudentManagementSystem.Controller;

import com.nigglenandu.StudentManagementSystem.Entity.Student;
import com.nigglenandu.StudentManagementSystem.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private IStudentService service;

    @PostMapping("/Student")
    public Student registerStudent(@RequestBody Student student) {
        Student st = service.saveStudent(student);
        return st;
    }

    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        List<Student> list = service.getAllStudents();
        return list;
    }

    @PutMapping("/Update")
    public Student updateStudent(@RequestBody Student student){
        Student st = service.saveStudent(student);
        return st;
    }

    @GetMapping("/Student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
        Student stu = service.getStudentById(id);
        return ResponseEntity.ok(stu);
    }

    @DeleteMapping("/Students")
    public Student deleteStudents(Student student){
        service.deleteStudent(student);
        return null;
    }

    @DeleteMapping("/Student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Integer id){
        service.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

}

