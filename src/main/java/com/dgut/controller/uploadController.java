package com.dgut.controller;

import com.dgut.entity.Picture;
import com.dgut.entity.Teacher;
import com.dgut.service.PictureService;
import com.dgut.utils.UploadUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 * @author: xieyougen
 * @email: xieyougen@tuandai.com
 * @description:
 * @date: 2018/2/1 9:50
 */
@Controller
public class uploadController {

    private Logger logger = LoggerFactory.getLogger(uploadController.class);

    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "cardManage/upload",method = RequestMethod.POST)
    public String upload(HttpServletRequest request,MultipartFile file,int ddlCard){
        String storePath = "D:/upload/";
        String path = null;
        try {
            path=UploadUtil.upload(file,storePath);
        } catch (IOException e) {
            logger.info("上传文件失败");
            e.printStackTrace();
        }
        Picture picture = new Picture();
        picture.setPath(path);
        Teacher teacher = (Teacher) request.getSession().getAttribute("teacher");
        picture.setTeacherId(teacher.getId());
        picture.setType(ddlCard);
        picture.setUploadTime(new Date());
        pictureService.insertSelective(picture);
        return "redirect:/my?url=teacher_cardManage";
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
