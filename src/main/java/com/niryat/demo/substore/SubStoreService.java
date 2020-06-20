package com.niryat.demo.substore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SubStoreService {

	@Autowired
	private SubStoreInterface subStoreInterface;
	
	public List<SubStores> getAllSubStores() {
		// TODO Auto-generated method stub
		List<SubStores> list = new ArrayList<>();
		subStoreInterface.findAll().forEach(list :: add);
		return list;
	}

	public SubStores getSubStore(String id) {
		// TODO Auto-generated method stub
		return subStoreInterface.findOne(id);
	}
	
	public List<SubStores> getSubStoreByMainStoreId(String main_store_id) {
		// TODO Auto-generated method stub
		return subStoreInterface.findByMainStoreId(main_store_id);
	}

	public void addSubStore(SubStores subStore) {
		// TODO Auto-generated method stub
		subStoreInterface.save(subStore);
	}

	public void updateSubStore(String id, SubStores subStore) {
		// TODO Auto-generated method stub
		subStoreInterface.save(subStore);		
	}

	public void removeSubStore(String id) {
		// TODO Auto-generated method stub
		subStoreInterface.delete(id);
	}
}
