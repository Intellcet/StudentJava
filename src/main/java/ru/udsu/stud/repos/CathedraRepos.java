package ru.udsu.stud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.udsu.stud.entity.Cathedra;

@Repository
public interface CathedraRepos extends JpaRepository<Cathedra, Long> {}
