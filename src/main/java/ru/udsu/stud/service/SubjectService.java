package ru.udsu.stud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.udsu.stud.entity.Subject;
import ru.udsu.stud.repos.SubjectRepos;

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

}
