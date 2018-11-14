package ru.udsu.stud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.udsu.stud.entity.Subject;

@Repository
public interface SubjectRepos extends JpaRepository<Subject, Long> {}
