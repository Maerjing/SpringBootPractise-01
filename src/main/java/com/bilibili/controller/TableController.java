package com.bilibili.controller;

import com.bilibili.bean.Admin;
import com.bilibili.bean.User;
import com.bilibili.exception.CoustomException;
import com.bilibili.service.impl.AdminServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class TableController {
    @Autowired
    private User user;

    @Autowired
    AdminServiceImpl adminServiceImpl;

    @ResponseBody
    @GetMapping("/admin")
    public Admin admin(@RequestParam("tid") String tid) {
        Admin admin = adminServiceImpl.queryAdmin(tid);
        log.info("admin的值为:",admin);
        return admin;
    }
    @GetMapping("/basic_table")
    public String basic_table(Model model) {
        List<User> list = new ArrayList<User>();
        User user = new User("wang", "123");
        User user1 = new User("li", "123");
        User user2 = new User("zhao", "123");
        User user3 = new User("zhou", "123");
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("users", list);
        if (list.size() > 3) {
            throw new CoustomException();
        }
        return "/table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table() {
        int a=2/0;
        return "/table/dynamic_table";
    }

    @GetMapping("editable_table")
    public String editable_table() {
        return "/table/editable_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "/table/responsive_table";
    }

}
