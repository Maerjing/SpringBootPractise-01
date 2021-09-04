package com.bilibili.service;

import com.bilibili.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> queryStudent();

    List<Student> queryStudentByClass(int cid);

    void addStudent(List<Student> students);

    void updateStudent(List<Student> students);
}
