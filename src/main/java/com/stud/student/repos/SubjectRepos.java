package com.stud.student.repos;

import com.stud.student.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepos extends JpaRepository<Subject, Long> {}
