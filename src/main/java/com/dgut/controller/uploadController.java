package com.dgut.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author: xieyougen
 * @email: xieyougen@tuandai.com
 * @description:
 * @date: 2018/2/1 9:50
 */
@RestController
public class uploadController {

    private Logger logger = LoggerFactory.getLogger(uploadController.class);

    @RequestMapping(value = "/upload1",method = RequestMethod.POST)
    public String upload(HttpServletRequest request,MultipartFile file){
        String uploadDir = "D:/upload/";
        File dir = new File(uploadDir);
        if(!dir.exists())
            dir.mkdirs();
        //获取文件后缀名
        //String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = file.getOriginalFilename();
        File tagetFile = new File(uploadDir+fileName);
        try {
            file.transferTo(tagetFile);
        }catch (IOException e){
            e.printStackTrace();
            logger.error("文件转化失败");
        }
        return "success";
    }

    /*
    * 前端用ssi-upload上传文件
    * */

    @RequestMapping(value = "/upload2",method = RequestMethod.POST)
    public String upload2(HttpServletRequest request){
        String uploadDir = "D:/upload/";
        File dir = new File(uploadDir);
        if(!dir.exists())
            dir.mkdirs();
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> fileMap =multipartHttpServletRequest.getFileMap();
        for (MultipartFile file:fileMap.values()) {
             String fileName = file.getOriginalFilename();
             File targetFile =new File(uploadDir+fileName);
            try {
                file.transferTo(targetFile);
            } catch (IOException e) {
                logger.error("文件转化失败，当前文件名：{}",file.getOriginalFilename());
                e.printStackTrace();
            }
        }
        //获取文件后缀名
        //String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
       /* String fileName = file.getOriginalFilename();
        File tagetFile = new File(uploadDir+fileName);
        try {
            file.transferTo(tagetFile);
        }catch (IOException e){
            e.printStackTrace();
            logger.error("文件转化失败");
        }*/
        return "success";
    }
}
