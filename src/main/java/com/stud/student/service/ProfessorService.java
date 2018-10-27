package com.stud.student.service;

import com.stud.student.entity.Professor;
import com.stud.student.repos.ProfessorRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfessorService {

    private ProfessorRepos professorRepos;

    @Autowired
    public ProfessorService(ProfessorRepos professorRepos) {
        this.professorRepos = professorRepos;
    }

    public Professor getProfessor(Long id) {
        return professorRepos.getOne(id);
    }

    public List<Professor> getAll() {
        return professorRepos.findAll();
    }

}
