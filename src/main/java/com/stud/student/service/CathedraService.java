package com.stud.student.service;

import com.stud.student.repos.CathedraRepos;
import com.stud.student.entity.Cathedra;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Cathedra> getAll() {
        return cathedraRepos.findAll();
    }

}
