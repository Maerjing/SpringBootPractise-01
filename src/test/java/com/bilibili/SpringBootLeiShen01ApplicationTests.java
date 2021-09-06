package com.bilibili;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.bilibili.bean.Student;
import com.bilibili.service.ClassService;
import com.bilibili.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
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
        log.info("总共{}条数据", query);
    }

    @Test
    @Transactional
    void addStudent() {
//        List<Student> students = studentService.queryStudent();
//        System.out.println(students);

//        Class classes = classService.queryClass(2);
//        System.out.println(classes);

        List<Student> list = new ArrayList<>();
        list.add(new Student(17, "fg", 2));
        list.add(new Student(18, "fg", 3));
        studentService.updateStudent(list);
    }

    //FileInputStream读取文件乱码问题解决方案
    @Test
    public void IO() throws IOException {
//        FileOutputStream stream = new FileOutputStream("a.txt");
//        String str="我是小天才";
//        stream.write(str.getBytes());
        FileInputStream input = new FileInputStream("a.txt");
        byte[] bytes = new byte[1024];
        input.read(bytes);
        String s = new String(bytes, 0, bytes.length);
        System.out.println(s);
        input.close();
    }

    @Test
    public void IORW() throws IOException {
//        FileWriter fileWriter = new FileWriter("b.txt");
//        fileWriter.write("我是小天才");
//        fileWriter.close();
        FileReader fileReader = new FileReader("b.txt");
        char[] chars = new char[100];
        int read = fileReader.read(chars);
        String str = new String(chars);
//        while (read!=-1){
//            System.out.println((char) read);
//        }
        System.out.println(str);
        fileReader.close();
    }
}
