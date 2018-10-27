package com.stud.student.service;

import com.stud.student.entity.Subject;
import com.stud.student.repos.SubjectRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private SubjectRepos subjectRepos;

    @Autowired
    public SubjectService(SubjectRepos subjectRepos) {
        this.subjectRepos = subjectRepos;
    }

    public Subject getSubject(Long id) {
        return subjectRepos.getOne(id);
    }

    public List<Subject> getAll() {
        return subjectRepos.findAll();
    }

}
