package com.mooc.mooc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@RestController
public class UploadController {

    @Value("${web.upload-path}")
    private String path;

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        //原文件名
        String originalName = file.getOriginalFilename();
        //取扩展名
        String ext = originalName.substring(originalName.lastIndexOf("."));
        //构造新文件名
        String newFile = UUID.randomUUID() + ext;
        //复制到映射的地址
        FileOutputStream fileOutputStream = null;
        try {
            //目标地址构造成输出流
            fileOutputStream = new FileOutputStream(path+newFile);
            //复制文件
            FileCopyUtils.copy(file.getInputStream(),fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFile;
    }

}
