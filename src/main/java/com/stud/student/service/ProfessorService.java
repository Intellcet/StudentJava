package com.stud.student.service;

import com.stud.student.entity.Professor;
import com.stud.student.repos.ProfessorRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepos professorRepos;

    public Professor getProfessor(Long id) {
        return professorRepos.getOne(id);
    }

    public List<Professor> getAll() {
        return professorRepos.findAll();
    }

}
