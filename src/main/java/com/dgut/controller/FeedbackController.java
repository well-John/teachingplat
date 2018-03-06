package com.dgut.controller;

import com.dgut.entity.Feedback;
import com.dgut.entity.Msg;
import com.dgut.entity.Student;
import com.dgut.entity.Teacher;
import com.dgut.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author: xieyougen
 * @email: xieyougen@tuandai.com
 * @description:
 * @date: 2018/3/6 16:10
 */
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Msg save(HttpSession session, Feedback feedback,String pcode){
        String code = (String) session.getAttribute("RANDOM_CODE_KEY");
        if (!code.equals(pcode.trim())) {
            return Msg.error("验证码错误");
        }
        feedback.setAddDate(new Date());
        Integer organiser = (Integer) session.getAttribute("identity");
        feedback.setOrgansier(organiser);
        if(organiser == 1){
            Student student = (Student) session.getAttribute("student");
            feedback.setOrgansierId(student.getId());
        }else{
            Teacher teacher = (Teacher) session.getAttribute("teacher");
            feedback.setOrgansierId(teacher.getId());
        }
        if(feedbackService.insertSelective(feedback)==1){
            return Msg.success("发布留言成功");
        }else{
            return Msg.error("发布留言失败");
        }
    }

}
