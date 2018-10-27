package com.stud.student.service;

import com.stud.student.entity.Group;
import com.stud.student.repos.GroupRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private GroupRepos groupRepos;

    @Autowired
    public GroupService(GroupRepos groupRepos) {
        this.groupRepos = groupRepos;
    }

    public Group getGroup(Long id) {
        return groupRepos.getOne(id);
    }

    public List<Group> getAll() {
        return groupRepos.findAll();
    }

}
