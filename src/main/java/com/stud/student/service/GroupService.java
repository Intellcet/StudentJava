package com.stud.student.service;

import com.stud.student.entity.Group;
import com.stud.student.repos.GroupRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepos groupRepos;

    public Group getGroup(Long id) {
        return groupRepos.getOne(id);
    }

    public List<Group> getAll() {
        return groupRepos.findAll();
    }

}
