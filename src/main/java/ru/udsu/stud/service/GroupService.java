package ru.udsu.stud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.udsu.stud.entity.Group;
import ru.udsu.stud.repos.GroupRepos;

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
}
