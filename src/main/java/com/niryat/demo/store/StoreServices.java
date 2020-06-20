package com.niryat.demo.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niryat.demo.substore.SubStoreInterface;
import com.niryat.demo.substore.SubStores;

@Service
public class StoreServices {
	
	@Autowired
	private StoreInterface storeInterface;
	
	@Autowired
	private SubStoreInterface subStoreInterface;
	

	public List<Store> getAllStores() {
		// TODO Auto-generated method stub
		List<Store> list = new ArrayList<>();
		storeInterface.findAll().forEach(list :: add);
		for(Store store: list) {
			store.setSubStores(subStoreInterface.findByMainStoreId(store.getId()));
		}
		return list;
	}

	public Store getStore(String id) {
		// TODO Auto-generated method stub
		Store s = storeInterface.findOne(id);
		s.setSubStores(subStoreInterface.findByMainStoreId(s.getId()));
		return s;
	}
	
	public Store getStoreByName(String username) {
		// TODO Auto-generated method stub
		Store s = storeInterface.findOne(username);
		s.setSubStores(subStoreInterface.findByMainStoreId(s.getId()));
		return s;
	}

	public void addStore(Store username) {
		// TODO Auto-generated method stub
		storeInterface.save(username);
	}

	public void updateStore(String id, Store user) {
		// TODO Auto-generated method stub
		storeInterface.save(user);
		List<SubStores> subStore = user.getSubStores();
		subStoreInterface.save(subStore);
	}

	public void removeStore(String id) {
		// TODO Auto-generated method stub
		storeInterface.delete(id);
	}

}
