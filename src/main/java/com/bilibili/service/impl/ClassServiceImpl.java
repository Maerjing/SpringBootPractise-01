package com.bilibili.service.impl;

import com.bilibili.bean.Class;
import com.bilibili.mapper.ClassMapper;
import com.bilibili.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassMapper classMapper;
    @Override
    public Class queryClass(int cid) {
        Class classes = classMapper.queryClass(cid);
        return classes;
    }
}
