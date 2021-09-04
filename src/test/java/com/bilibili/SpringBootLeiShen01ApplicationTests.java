package com.bilibili;

import com.bilibili.bean.Class;
import com.bilibili.bean.Student;
import com.bilibili.bean.User;
import com.bilibili.service.ClassService;
import com.bilibili.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
class SpringBootLeiShen01ApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    StudentService studentService;

    @Autowired
    ClassService classService;

    @Test
    void contextLoads() {
        Integer query = jdbcTemplate.queryForObject("select count(*) from book", Integer.class);
        log.info("总共{}条数据",query);
    }

    @Test
    @Transactional
    void addStudent(){
//        List<Student> students = studentService.queryStudent();
//        System.out.println(students);

//        Class classes = classService.queryClass(2);
//        System.out.println(classes);

        List<Student> list=new ArrayList<>();
        list.add(new Student(17,"fg",2));
        list.add(new Student(18,"fg",3));
        studentService.updateStudent(list);
    }
}
