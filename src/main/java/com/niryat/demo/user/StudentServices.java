package com.niryat.demo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
	
	@Autowired
	private StudentInterface studentInterface;
	
	

	public List<User> getAllStudents() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();
		studentInterface.findAll().forEach(list :: add);
		return list;
	}

	public User getStudent(String id) {
		// TODO Auto-generated method stub
		return studentInterface.findOne(id);
	}
	
	public User getStudentByUsername(String username) {
		// TODO Auto-generated method stub
		return studentInterface.findOne(username);
	}

	public void addStudent(User username) {
		// TODO Auto-generated method stub
		studentInterface.save(username);
	}

	public void updateStudent(String id, User user) {
		// TODO Auto-generated method stub
		studentInterface.save(user);		
	}

	public void removeStudent(String id) {
		// TODO Auto-generated method stub
		studentInterface.delete(id);
		}

}
