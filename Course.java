package com.studentcourses.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String courseNo;
    private String grade;
    private Integer creditHours;
    @ManyToOne
    @JoinColumn(name = "stuent_id")
    @JsonBackReference
    private Student student;
}
