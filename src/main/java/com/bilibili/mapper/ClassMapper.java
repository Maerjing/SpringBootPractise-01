package com.bilibili.mapper;

import com.bilibili.bean.Class;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
    Class queryClass(int cid);
}
