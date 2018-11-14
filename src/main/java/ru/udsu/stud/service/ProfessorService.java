package ru.udsu.stud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.udsu.stud.entity.Professor;
import ru.udsu.stud.repos.ProfessorRepos;

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

}
