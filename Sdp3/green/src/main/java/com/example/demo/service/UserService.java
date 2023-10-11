package com.example.demo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



//import org.apache.catalina.realm.JNDIRealm.User;

//import org.apache.tomcat.jni.User;

//import org.apache.catalina.realm.JNDIRealm.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import com.example.model.User;

import com.example.demo.repository.UserRepository;

@Service
public class UserService 
{
	
  @Autowired
  UserRepository userrepository;
  
  public boolean adduser(User user) 
  {
	  try {
		  userrepository.save(user);
		  return true; 
	  }
	  catch(Exception e) {
		  return false;
	  }
  }
  
  public boolean checkuser(String username, String password, HttpServletRequest request) 
  {
	  List<User> user = userrepository.findByUsernameAndPassword(username, password);
	  if(user.isEmpty()) {
		  return false;
	  }
	  HttpSession session = request.getSession(); 
	  session.setAttribute("username", user.get(0).getUsername());
	  return true;
  }
  
  public boolean sessionExists(HttpSession session) {
	  String user = (String) session.getAttribute("username");
		if(user != null) {
			return true;
		}
		return false;
  }
  
  public void destroySession(HttpSession session) {
	  session.removeAttribute("username");
	  session.invalidate();
  }

}
