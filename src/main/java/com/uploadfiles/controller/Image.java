package com.uploadfiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.*;
import java.util.Objects;
import java.util.UUID;

@Controller
public class Image {


    // https://www.baeldung.com/spring-httpmessageconverter-rest
    // https://www.baeldung.com/spring-multipartfile-to-file
    // https://www.baeldung.com/spring-file-upload

    @Autowired
    ServletContext servletContext;


    @GetMapping(value = "/uploadFile")
    public String uploadGet() {

        return "/upload";
    }




    @PostMapping(value = "/uploadFile")
    public String uploadPost(@RequestParam("file") MultipartFile multipartFile) throws IOException {


        String extension;

        switch (Objects.requireNonNull(multipartFile.getContentType())) {
            case "image/jpeg":
                extension = ".jpg";
                break;
            case "image/png":
                extension = ".png";
                break;
            default: extension = null;
        }



//        File file = new File("D:\\GitHub\\Favorskij\\UploadFiles\\src\\main\\resources\\"
//                + new RenameFile().nextString() + extension);
//        multipartFile.transferTo(file);

        File file = new File("\\resources\\"
                + generateString() + extension);
        multipartFile.transferTo(file);



        return "/upload";
    }


    public static String generateString() {
        return UUID.randomUUID().toString().replace("-", "");
    }

//    public static String generateString() {
//        String uuid = UUID.randomUUID().toString();
//        return uuid.replace("-", "");
//    }

}
