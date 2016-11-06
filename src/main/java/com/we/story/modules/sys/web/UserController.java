package com.we.story.modules.sys.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.we.story.modules.sys.entity.User;
import com.we.story.modules.sys.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	public UserController(){
		
	}
	
	@Autowired
	public UserService service;
	
	@RequestMapping(value = {"/get", ""})
	public String get(HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = service.selectByPrimaryKey(request.getParameter("id")); 
		model.addAttribute("user", user);
		return "modules/sys/userList";
	}
}
