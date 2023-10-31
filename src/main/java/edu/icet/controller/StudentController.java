package edu.icet.controller;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = {"*"})
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/get-student")
    public Iterable<StudentEntity> getStudent(){
        return studentService.getStudent();
    }
//    @PostMapping("/post-student")
//    public void setStudent(@RequestBody Student student){
//        studentService.setStudent(student);
//    }
    @PostMapping("/create-student")
    public void registerStudent(@RequestBody StudentEntity student){
        studentService.registerStudent(student);
    }
}
