package com.stud.student.control;

import com.stud.student.entity.Group;
import com.stud.student.entity.Student;
import com.stud.student.service.GroupService;
import com.stud.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final StudentService studentService;
    private final GroupService groupService;

    @RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
    private Student getOne(@PathVariable Long id) {
        return studentService.getOne(id);
    }

    @RequestMapping(value = "/getAll/Students", method = RequestMethod.GET)
    private List<Student> getAllStudents() { return studentService.getAll(); }

    @RequestMapping(value = "/getGroup/{id}", method = RequestMethod.GET)
    private Group getGroup(@PathVariable Long id) { return groupService.getGroup(id); }

    @RequestMapping(value = "/getAll/Groups", method = RequestMethod.GET)
    private List<Group> getAllGroups() { return groupService.getAll(); }
}


