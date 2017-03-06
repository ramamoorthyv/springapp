package com.lib;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {
	
	private JdbcUserDao jt;
	
	@RequestMapping("/hello")
	public ModelAndView mymethod(){
		return new ModelAndView("hellopage","msg","Hello First Spring");
	}
	
	@RequestMapping("/user")
	public ModelAndView user(){
		return new ModelAndView("user","command",new User());
	}
	
	 @RequestMapping(value = "/adduser", method = RequestMethod.POST)
     public String addStudent(@ModelAttribute("user")User user, 
  
  ModelMap model) {
        
     return "adduser";
  }
	 
  @RequestMapping("/listusers") 
  public ModelAndView viewemp(){  
      List<User> users= jt.listUsers();  
      return new ModelAndView("listusers","users",users);  
  }  
}
