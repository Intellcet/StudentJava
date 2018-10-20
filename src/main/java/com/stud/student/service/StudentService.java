package com.stud.student.service;

import com.stud.student.entity.Student;
import com.stud.student.repos.StudentRepos;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class StudentService {

    @Autowired
    private StudentRepos studentRepos;

    public Student getOne(Long id) {
        return studentRepos.getOne(id);
    }

}
