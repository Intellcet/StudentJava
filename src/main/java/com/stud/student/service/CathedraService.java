package com.stud.student.service;

import com.stud.student.repos.CathedraRepos;
import com.stud.student.entity.Cathedra;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CathedraService {
    private final CathedraRepos cathedraRepos;

    public Cathedra getCathedra(Long id) {
        return cathedraRepos.getOne(id);
    }

    public List<Cathedra> getAll() {
        return cathedraRepos.findAll();
    }

}
