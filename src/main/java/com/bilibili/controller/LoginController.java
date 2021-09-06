package com.bilibili.controller;

import com.bilibili.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @GetMapping(value = {"/", "/login"})
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String index(User user, HttpSession session, Model model) {
        if (StringUtils.hasLength(user.getUsername()) & user.getPassword().equals("123456")) {
            session.setAttribute("user", user);
            return "redirect:/toLogin";
        } else {
            model.addAttribute("msg", "密码错误!");
            return "login";
        }

    }

    @GetMapping("/toLogin")
    public String toLogin(HttpSession session, Model model) {
//        Object user = session.getAttribute("user");
//        if (user!=null){
//            return "index";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
        return "index";
    }
}
