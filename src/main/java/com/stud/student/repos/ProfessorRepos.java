package com.stud.student.repos;

import com.stud.student.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepos extends JpaRepository<Professor, Long> {}
