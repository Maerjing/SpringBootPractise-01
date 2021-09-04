package com.bilibili.mapper;

import com.bilibili.bean.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    Admin queryAdmin(String tid);

    int insertAdmin(Admin admin);
}
