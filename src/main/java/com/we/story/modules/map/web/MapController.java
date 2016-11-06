package com.we.story.modules.map.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.we.story.modules.sys.entity.User;
import com.we.story.modules.sys.service.UserService;

@Controller
@RequestMapping(value = "/map")
public class MapController {

	public MapController(){
		
	}
	
	@RequestMapping(value = {"/index", ""})
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		return "modules/map/mapIndex";
	}
}
