package com.bilibili.bean;


import lombok.Data;

import java.util.List;

@Data
public class Class {
    private int cid;
    private String cname;
    private List<Student> studentList;
}
