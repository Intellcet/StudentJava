package com.stud.student.service;

import com.stud.student.entity.Subject;
import com.stud.student.repos.SubjectRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepos subjectRepos;

    public Subject getSubject(Long id) {
        return subjectRepos.getOne(id);
    }

    public List<Subject> getAll() {
        return subjectRepos.findAll();
    }

}
