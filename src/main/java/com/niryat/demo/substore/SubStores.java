package com.niryat.demo.substore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubStores {
	
	@Id
	@GeneratedValue
	private String id;
	private String main_store_id;
	private String zipcode;
	private String city;
	private String state;
	private String slot_capacity;
	private String operation_time;
	private String max_time_to_spend;
	private String business_classification;
	private String store_area;
	private String accessible_area;
	
	public SubStores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubStores(String id, String main_store_id, String zipcode, String city, String state, String slot_capacity,
			String operation_time, String max_time_to_spend, String business_classification, String store_area,
			String accessible_area) {
		super();
		this.id = id;
		this.main_store_id = main_store_id;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.slot_capacity = slot_capacity;
		this.operation_time = operation_time;
		this.max_time_to_spend = max_time_to_spend;
		this.business_classification = business_classification;
		this.store_area = store_area;
		this.accessible_area = accessible_area;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMain_store_id() {
		return main_store_id;
	}

	public void setMain_store_id(String main_store_id) {
		this.main_store_id = main_store_id;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSlot_capacity() {
		return slot_capacity;
	}

	public void setSlot_capacity(String slot_capacity) {
		this.slot_capacity = slot_capacity;
	}

	public String getOperation_time() {
		return operation_time;
	}

	public void setOperation_time(String operation_time) {
		this.operation_time = operation_time;
	}

	public String getMax_time_to_spend() {
		return max_time_to_spend;
	}

	public void setMax_time_to_spend(String max_time_to_spend) {
		this.max_time_to_spend = max_time_to_spend;
	}

	public String getBusiness_classification() {
		return business_classification;
	}

	public void setBusiness_classification(String business_classification) {
		this.business_classification = business_classification;
	}

	public String getStore_area() {
		return store_area;
	}

	public void setStore_area(String store_area) {
		this.store_area = store_area;
	}

	public String getAccessible_area() {
		return accessible_area;
	}

	public void setAccessible_area(String accessible_area) {
		this.accessible_area = accessible_area;
	}
	
}
