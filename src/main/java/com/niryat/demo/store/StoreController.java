package com.niryat.demo.store;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StoreController {
	
	@Autowired
	private StoreServices storeServices;
	
	@RequestMapping("/api/v1/stores")
	public List<Store> getAllStudents() {
		return storeServices.getAllStores();
		
	}
	
	@RequestMapping("/api/v1/store/id={id}")
	public Store getStudent(@PathVariable String id) {
		return storeServices.getStore(id);	
	}
	
	@RequestMapping("/api/v1/store/store={name}")
	public Store getStudentByUsername(@PathVariable String name) {
		return storeServices.getStoreByName(name);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/v1/store")
	public String addStore(@RequestBody Store name) {
		storeServices.addStore(name);
		return "{\"message\":\"success\"}";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/v1/store/id={id}")
	public String updateStore(@PathVariable String id,@RequestBody Store user) {
		storeServices.updateStore(id, user);
		return "{\"message\":\"success\"}";
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/api/v1/store/id={id}")
	public String removeStore(@PathVariable String id) {
		storeServices.removeStore(id);
		return "{\"message\":\"success\"}";
	}
}
