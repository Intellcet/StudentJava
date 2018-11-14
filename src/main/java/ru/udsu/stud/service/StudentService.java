package ru.udsu.stud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.udsu.stud.entity.Student;
import ru.udsu.stud.repos.StudentRepos;

@Service
public class StudentService {

    private StudentRepos studentRepos;

    @Autowired
    public StudentService(StudentRepos studentRepos) {
        this.studentRepos = studentRepos;
    }

    public Student getOne(Long id){
        return studentRepos.getOne(id);
    }

}
