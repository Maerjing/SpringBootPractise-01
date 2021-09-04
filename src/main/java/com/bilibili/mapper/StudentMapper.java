package com.bilibili.mapper;

import com.bilibili.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> queryStudent();

    List<Student> queryStudentByClass(int cid);

    void addStudent(List<Student> students);

    void updateStudent(List<Student> students);
}
