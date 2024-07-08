package com.nigglenandu.StudentManagementSystem.Service;

import com.nigglenandu.StudentManagementSystem.Entity.Student;
import com.nigglenandu.StudentManagementSystem.Repo.RepoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private RepoStudent repoStudent;

    public Student saveStudent(Student student){
        repoStudent.save(student);
        return student;
    }

    public List<Student> getAllStudents(){
        return repoStudent.findAll();
    };

    public Student updateStudent(Student student){
        repoStudent.save(student);
        return student;
    }

    public Student getStudentById(Integer id){
        Optional<Student> optional = repoStudent.findById(id);
        return optional.get();
    }

    public void deleteStudent(Student student){
        repoStudent.delete(student);
    }

    public void deleteStudentById(Integer id){
        repoStudent.deleteById(id);
    }

}
