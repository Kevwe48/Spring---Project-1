package com.studentcourses.repository;

import com.studentcourses.model.Course;
import com.studentcourses.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    @Query("select course.student from Course course where course.courseNo=?1")
    List<Student> findByCourse(String courseNo);

}
