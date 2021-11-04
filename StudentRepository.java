package com.studentcourses.repository;

import com.studentcourses.model.Student;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("select student from Student student where student.first_name=?1")
    List<Student> findByFirstName(String firstName);

//    @Query("select student from Student student where student.course.")
//    List<Student> findByCourseNumber(String courseNo);

}
