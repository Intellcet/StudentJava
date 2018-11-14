package ru.udsu.stud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.udsu.stud.entity.Student;

@Repository
public interface StudentRepos extends JpaRepository<Student, Long> {

}
