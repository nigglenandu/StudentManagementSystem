package com.nigglenandu.StudentManagementSystem.Service;

import com.nigglenandu.StudentManagementSystem.Entity.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IStudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student updateStudent(Student student);
    public Student getStudentById(Integer id);
    public void deleteStudent(Student student);
    public void deleteStudentById(Integer id);
}
