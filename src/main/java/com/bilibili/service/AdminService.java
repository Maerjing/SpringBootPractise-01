package com.bilibili.service;

import com.bilibili.bean.Admin;
import com.bilibili.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface AdminService {
    Admin queryAdmin(String tid);
}
