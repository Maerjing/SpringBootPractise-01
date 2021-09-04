package com.bilibili.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
public class FormController {
    @GetMapping("/form_layouts")
    public String form_layouts() {
        return "/form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username")String username,
                         @RequestPart("headimg") MultipartFile headimg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        if (!headimg.isEmpty()){
            String originalFilename = headimg.getOriginalFilename();
            headimg.transferTo(new File("E:\\图片\\"+originalFilename));
        }

        for (MultipartFile photo : photos) {
            if (!photo.isEmpty()){
                String originalFilename = photo.getOriginalFilename();
                photo.transferTo(new File("E:\\图片\\"+originalFilename));
            }
        }
        return "index";
    }
}
