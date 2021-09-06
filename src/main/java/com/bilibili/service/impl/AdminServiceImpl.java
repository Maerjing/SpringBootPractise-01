package com.bilibili.service.impl;

import com.bilibili.bean.Admin;
import com.bilibili.mapper.AdminMapper;
import com.bilibili.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin queryAdmin(String tid) {
        return adminMapper.queryAdmin(tid);
    }
}
