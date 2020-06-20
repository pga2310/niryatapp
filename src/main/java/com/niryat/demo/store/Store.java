package com.niryat.demo.store;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.niryat.demo.substore.SubStores;

@Entity	
public class Store {
	
	@Id
	@GeneratedValue
	private String id;
	private String name;
	private String category;
	@OneToMany(targetEntity=SubStores.class, mappedBy="id", 
			fetch=FetchType.EAGER)
	private List<SubStores> subStores;

	public Store(){}
	
	public Store(String id, String name, String category, List<SubStores> subStores) {
		super();
		this.id = id;
		this.name = name;
		this.category=category;
		this.subStores = subStores;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<SubStores> getSubStores() {
		return subStores;
	}

	public void setSubStores(List<SubStores> subStores) {
		this.subStores = subStores;
	}

}
