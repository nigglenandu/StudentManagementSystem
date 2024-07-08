package com.nigglenandu.StudentManagementSystem.Service;

import com.nigglenandu.StudentManagementSystem.Entity.Student;
import com.nigglenandu.StudentManagementSystem.Repo.RepoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private RepoStudent repoStudent;

    public Student saveStudent(Student student){
        repoStudent.save(student);
        return student;
    }

}
