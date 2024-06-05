package com.example.springboottutorial.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("student")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("new")
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);

    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable ("studentId") Long studentId){
        studentService.deleteStudent(studentId);

    }
}


