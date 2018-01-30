package com.dgut.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgut.entity.Comment;
import com.dgut.entity.CommentExample;
import com.dgut.dao.CommentMapper;
import com.dgut.service.CommentService;
@Service
public class CommentServcieImpl extends BaseServiceImpl<Comment, CommentExample> implements CommentService{

	@Autowired
	CommentMapper commentMapper;
	
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(commentMapper);
	}

}
