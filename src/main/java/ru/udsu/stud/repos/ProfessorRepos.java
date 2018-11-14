package ru.udsu.stud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.udsu.stud.entity.Professor;

@Repository
public interface ProfessorRepos extends JpaRepository<Professor, Long> {}
