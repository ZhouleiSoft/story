package com.we.story.modules.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.we.story.modules.sys.dao.UserMapper;
import com.we.story.modules.sys.entity.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User selectByPrimaryKey(String id){
		return userMapper.selectByPrimaryKey(id);
	}
}
