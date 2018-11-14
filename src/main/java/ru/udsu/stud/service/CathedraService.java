package ru.udsu.stud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.udsu.stud.entity.Cathedra;
import ru.udsu.stud.repos.CathedraRepos;

@Service
public class CathedraService {

    private CathedraRepos cathedraRepos;

    @Autowired
    public CathedraService(CathedraRepos cathedraRepos) {
        this.cathedraRepos = cathedraRepos;
    }

    public Cathedra getCathedra(Long id) {
        return cathedraRepos.getOne(id);
    }
}
