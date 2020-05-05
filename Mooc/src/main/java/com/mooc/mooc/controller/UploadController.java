package com.mooc.mooc.controller;

import com.mooc.mooc.util.FileHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @Value("${web.upload-path}")
    private String path;

    @Value("${web.course-ware-upload-path}")
    private String courseWarePath;

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        return FileHelper.upload(path, file);
    }

    @RequestMapping("/uploadCourseWare")
    public String uploadCourseWare(@RequestParam("file") MultipartFile file){
        return FileHelper.upload(courseWarePath, file);
    }

}
