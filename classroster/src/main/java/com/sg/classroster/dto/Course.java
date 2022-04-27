/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classroster.dto;

import java.util.List;
import com.sg.classroster.dto.Student;

/**
 *
 * @author 17202
 */
public class Course {
    private int id;
    private String name;
    private String description;
    private Teacher teacher;
    private List<Student> students;
    
    public Course(int id, String name, String description, Teacher teacher, List<Student> students) {
        this.id=id;
        this.name=name;
        this.description=description;
        this.teacher=teacher;
        this.students=students;
    }
    
    public Course() {}
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
