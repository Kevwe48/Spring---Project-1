package com.studentcourses.service;

import com.studentcourses.model.Course;
import com.studentcourses.model.Student;
import com.studentcourses.repository.CourseRepository;
import com.studentcourses.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    public Student addStudentWithCourses(Student student){

        Student savedStudent = studentRepository.save(student);

        for (Course course:student.getCourse()) {
            course.setStudent(student);
            courseRepository.save(course);
        }

    return studentRepository.save(student);
    }

    public List<Student> getAllStudentsWithCourses(){

        return studentRepository.findAll();
    }

    public List<Student> findByFirstName(String firstName){

        return studentRepository.findByFirstName(firstName);
    }

    public List<Student> findByCourseNo(String courseNo){

        return courseRepository.findByCourse(courseNo);
    }
}
