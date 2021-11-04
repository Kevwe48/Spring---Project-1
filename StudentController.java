package com.studentcourses.controller;

import com.studentcourses.model.Student;
import com.studentcourses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudentWithCourse")
    public Student addStudent(@RequestBody Student student){

        return studentService.addStudentWithCourses(student);
    }

    @GetMapping("/allStudentsWithCourses")
    public List<Student> getAllStudents(){

        return studentService.getAllStudentsWithCourses();
    }

    @GetMapping("/findByCourseNo/{courseNo}")
    public List<Student> getAllStudentsByCourseNo(@PathVariable("courseNo") String courseNo){

        return studentService.findByCourseNo(courseNo);
    }

    @GetMapping("/findByfirstName/{firstName}")
    public List<Student> getAllStudentsByFirstName(@PathVariable("firstName") String firstName){

        return studentService.findByFirstName(firstName);
    }

}
