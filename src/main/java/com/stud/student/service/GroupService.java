package com.stud.student.service;

import com.stud.student.entity.Group;
import com.stud.student.repos.GroupRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepos groupRepos;

    public Group getGroup(Long id) {
        return groupRepos.getOne(id);
    }

}
