package com.nigglenandu.StudentManagementSystem.Repo;

import com.nigglenandu.StudentManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoStudent extends JpaRepository<Student, Integer> {
}
