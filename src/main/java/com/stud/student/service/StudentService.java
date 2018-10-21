package com.stud.student.service;

import com.stud.student.entity.Student;
import com.stud.student.repos.StudentRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepos studentRepos;

    public Student getOne(Long id) {
        return studentRepos.getOne(id);
    }
    public List<Student> getAll() { return studentRepos.findAll(); }

}
