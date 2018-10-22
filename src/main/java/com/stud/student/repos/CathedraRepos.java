package com.stud.student.repos;

import com.stud.student.entity.Cathedra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CathedraRepos extends JpaRepository<Cathedra, Long> {}
