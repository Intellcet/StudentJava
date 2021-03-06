package com.stud.student.repos;

import com.stud.student.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepos extends JpaRepository<Group, Long> { }