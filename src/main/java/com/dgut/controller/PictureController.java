package com.dgut.controller;

import com.dgut.entity.Msg;
import com.dgut.entity.Picture;
import com.dgut.entity.Teacher;
import com.dgut.service.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: xieyougen
 * @email: xieyougen@tuandai.com
 * @description:
 * @date: 2018/5/10 9:07
 */
@Slf4j
@RestController
@RequestMapping("/picture")
public class PictureController {

    private static final String IDENTITY = "identity"; //当前身份 1学员，2 教员

    private static final String TEACHER = "teacher";

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/getMyPhotos")
    public Msg getMyPhotos(HttpSession session) {
        Integer identity = (Integer) session.getAttribute(IDENTITY);
        if (identity != null && identity.equals(2)) {
            Teacher teacher = (Teacher) session.getAttribute(TEACHER);
            List<Picture> pictures = pictureService.selectTeacherPhotos(teacher.getId());
            return Msg.success("").add("list", pictures);
        } else {
            return Msg.error("请先登录教师账号");
        }
    }


    @RequestMapping("/delete")
    public Msg delete(Integer id) {
        if (pictureService.delete(id) == 1) {
            return Msg.success("删除成功");
        } else {
            return Msg.error("删除失败");
        }
    }


}
