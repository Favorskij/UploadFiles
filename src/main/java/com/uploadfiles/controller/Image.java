package com.uploadfiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

@Controller
public class Image {


    // https://www.baeldung.com/spring-multipartfile-to-file

    @Autowired
    ServletContext servletContext;


    @GetMapping(value = "/uploadFile")
    public String uploadGet() {

        return "/upload";
    }




    @PostMapping(value = "/uploadFile")
    public String uploadPost(@RequestParam("file") MultipartFile filed) throws Exception {


        File file = new File("D:\\WEB-INF\\image\\" + filed.getOriginalFilename());

        filed.transferTo(file);


        return "/upload";
    }



}
