package com.icicilombard.jwtauth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.icicilombard.jwtauth.iservice.IuserService;
import com.icicilombard.jwtauth.model.User;
import com.icicilombard.jwtauth.payload.UserRequest;
import com.icicilombard.jwtauth.payload.UserResponse;
import com.icicilombard.jwtauth.util.JwtUtility;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    
	@Autowired
	private IuserService iuserService;
	@Autowired
	private JwtUtility jwtUtl;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user)
	{
		
		user=iuserService.saveUser(user);
		
		
		return  ResponseEntity.ok("user "+user.getId()+" saved successfully" );
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest userRequest)
	{
		
		
		
		
		return  ResponseEntity.ok(new UserResponse(jwtUtl.getToken(userRequest.getUsername()), "token generated successfully") );
	}
	
	
	
}
