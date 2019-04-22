package org.cg.controller;

import java.util.Map;

import org.cg.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Map<String,Object> map)
	{
		
		
		return "user/register";
		
	}
	
	@RequestMapping(value="/details", method=RequestMethod.POST)
	public String details(User user,Map<String,Object> map)
	{
		map.put("fName", user.getfName());
		map.put("lName", user.getlName());
		map.put("email", user.getEmail());
		map.put("mobile", user.getMobile());
		return "user/details";
		
	}
	
	
}
