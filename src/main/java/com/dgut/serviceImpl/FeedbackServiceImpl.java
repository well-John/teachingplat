package com.dgut.serviceImpl;

import com.dgut.dao.FeedbackMapper;
import com.dgut.entity.Feedback;
import com.dgut.entity.FeedbackExample;
import com.dgut.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xieyougen
 * @email: xieyougen@tuandai.com
 * @description:
 * @date: 2018/3/6 16:07
 */
@Service
public class FeedbackServiceImpl extends BaseServiceImpl<Feedback,FeedbackExample> implements FeedbackService {

    @Autowired
    FeedbackMapper feedbackMapper;

    @Autowired
    public void setBaseMapper() {
        this.setBaseMapper(feedbackMapper);
    }
}
