package ru.udsu.stud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.udsu.stud.entity.Group;

@Repository
public interface GroupRepos extends JpaRepository<Group, Long> {}
