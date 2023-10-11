package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import org.apache.catalina.realm.JNDIRealm.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.UserService;
import com.example.model.*;

@Controller

public class EmpController {
	@Autowired
	private UserService userservice;
	@GetMapping("/")
	public String home() 
	{
		 return "index";		
	}
	@GetMapping("/regpro")
	public String RegProfrssional() 
	{
		return "pro";
	}
	@GetMapping("/blogsnews")
	public String Blogs()
	{
		return "blog";
		
	}
	@GetMapping("/help")
	public String Help()
	{
		return "help";
	}
	@GetMapping("/aboutus")
	public String Aboutus() 
	{
		return "aboutus";
		
	}
	@GetMapping("/index")
	public String index() 
	{
		return "index";
		
	}
	@GetMapping("/OurImpact")
	public String impact() 
	{
		return "OurImpact";
		
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
		//public ModelAndView signup(HttpServletRequest request) {
			//ModelAndView mv = new ModelAndView();
	//HttpSession session = request.getSession();
	//boolean loggedIn = userservice.sessionExists(session);
	//if(loggedIn) {
	//	mv.setViewName("redirect:/");
	//}
	//else {
	//	mv.setViewName("signup");
	//}
	//	return mv;
	//}
	//@PostMapping("/adduser")
	//public ModelAndView adduser(@RequestParam("email") String email,
	//		                    @RequestParam("usn") String username, 
	//							 @RequestParam("psw") String password,
	//							 @RequestParam("psw-repeat") String password1,

	//							HttpServletRequest request) throws Exception {
									//	ModelAndView mv = new ModelAndView();
	// User user = new User();
	//	user.setId(123);
	//user.setEmail(email);
	//	user.setUsername(username);
	//	user.setPassword(password);
	//	boolean added = userservice.adduser(user);
	////	if(added) {
	//	mv.setViewName("userLogin");
	//	return mv;
	//}
	//mv.setViewName("userRegister");
	//return mv;
	//}
	@GetMapping("/login")
	public String login() 
	{
		return "login";
	}
	
	}
	

