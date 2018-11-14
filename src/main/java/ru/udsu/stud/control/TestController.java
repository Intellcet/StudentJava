package ru.udsu.stud.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.udsu.stud.entity.*;
import ru.udsu.stud.service.*;

@RestController
public class TestController {

    private StudentService studentService;
    private GroupService groupService;
    private CathedraService cathedraService;
    private ProfessorService professorService;
    private SubjectService subjectService;

    @Autowired
    public TestController(StudentService studentService, GroupService groupService, CathedraService cathedraService, ProfessorService professorService, SubjectService subjectService) {
        this.studentService = studentService;
        this.groupService = groupService;
        this.cathedraService = cathedraService;
        this.professorService = professorService;
        this.subjectService = subjectService;
    }

    @RequestMapping(value = "/stud/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable Long id){
        Student student = studentService.getOne(id);
        return student;
    }

    @RequestMapping(value = "/getGroup/{id}", method = RequestMethod.GET)
    public Group getGroup(@PathVariable Long id) {
        Group group = groupService.getGroup(id);
        return group;
    }

    @RequestMapping(value = "/getCathedra/{id}", method = RequestMethod.GET)
    public Cathedra getCathedra(@PathVariable Long id) {
        Cathedra cathedra = cathedraService.getCathedra(id);
        return cathedra;
    }

    @RequestMapping(value = "/getProfessor/{id}", method = RequestMethod.GET)
    public Professor getProfessor(@PathVariable Long id) {
        Professor professor = professorService.getProfessor(id);
        return professor;
    }

    @RequestMapping(value = "/getSubject/{id}", method = RequestMethod.GET)
    public Subject getSubject(@PathVariable Long id) {
        Subject subject = subjectService.getSubject(id);
        return subject;
    }


}
