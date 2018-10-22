package com.stud.student.control;

import com.stud.student.entity.*;
import com.stud.student.service.*;
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
    private final CathedraService cathedraService;
    private final ProfessorService professorService;
    private final SubjectService subjectService;

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

    @RequestMapping(value = "/getCathedra/{id}", method = RequestMethod.GET)
    private Cathedra getCathedra(@PathVariable Long id) { return cathedraService.getCathedra(id); }

    @RequestMapping(value = "/getAll/Cathedras", method = RequestMethod.GET)
    private List<Cathedra> getAllCathedras() { return cathedraService.getAll(); }

    @RequestMapping(value = "/getProfessor/{id}", method = RequestMethod.GET)
    private Professor getProfessor(@PathVariable Long id) { return professorService.getProfessor(id); }

    @RequestMapping(value = "/getAll/Professors", method = RequestMethod.GET)
    private List<Professor> getAllProfessors() { return professorService.getAll(); }

    @RequestMapping(value = "/getSubject/{id}", method = RequestMethod.GET)
    private Subject getSubject(@PathVariable Long id) { return subjectService.getSubject(id); }

    @RequestMapping(value = "/getAll/Subjects", method = RequestMethod.GET)
    private List<Subject> getAllSubjects() { return subjectService.getAll(); }

}


