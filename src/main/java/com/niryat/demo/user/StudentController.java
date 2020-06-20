package com.niryat.demo.user;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
	@Autowired
	private StudentServices studentServices;
	
	@RequestMapping("/api/v1/users")
	public List<User> getAllStudents() {
		return studentServices.getAllStudents();
		
	}
	
	@RequestMapping("/api/v1/user/id={id}")
	public User getStudent(@PathVariable String id) {
		return studentServices.getStudent(id);	
	}
	
	@RequestMapping("/api/v1/user/username={username}")
	public User getStudentByUsername(@PathVariable String username) {
		return studentServices.getStudentByUsername(username);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/v1/user")
	public String addStudent(@RequestBody User username) {
		studentServices.addStudent(username);
		return "{\"message\":\"success\"}";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/v1/user/id={id}")
	public String updateStudent(@PathVariable String id,@RequestBody User user) {
		studentServices.updateStudent(id, user);
		return "{\"message\":\"success\"}";
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/api/v1/user/id={id}")
	public String removeStudent(@PathVariable String id) {
		studentServices.removeStudent(id);
		return "{\"message\":\"success\"}";
	}
}
