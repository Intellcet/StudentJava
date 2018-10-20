package com.stud.student.repos;

import com.stud.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepos extends JpaRepository<Student, Long> {

}
