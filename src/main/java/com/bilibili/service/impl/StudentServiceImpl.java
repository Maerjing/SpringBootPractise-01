package com.bilibili.service.impl;

import com.bilibili.bean.Student;
import com.bilibili.mapper.StudentMapper;
import com.bilibili.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentMapper.queryStudent();
        return students;
    }

    @Override
    public List<Student> queryStudentByClass(int cid) {
        List<Student> students = studentMapper.queryStudentByClass(cid);
        return students;
    }

//    @Transactional
    @Override
    public void addStudent(List<Student> students) {
        studentMapper.addStudent(students);
    }

    @Override
    public void updateStudent(List<Student> students) {
        studentMapper.updateStudent(students);
    }
}
