package com.stud.student.control;

import com.stud.student.entity.Student;
import com.stud.student.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@ResponseBody
public class TestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
    private Student getOne(@PathVariable Long id) {
        return studentService.getOne(id);
    }

}


