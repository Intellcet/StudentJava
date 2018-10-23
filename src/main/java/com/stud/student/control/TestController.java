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

    @RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
    private Student getOne(@PathVariable Long id) {
        return studentService.getOne(id);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    private List<Student> getAllStudents() { return studentService.getAll(); }

}


