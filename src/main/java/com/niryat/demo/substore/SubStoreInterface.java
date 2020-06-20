package com.niryat.demo.substore;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SubStoreInterface extends JpaRepository<SubStores, String> {

	 @Query(value="SELECT * FROM sub_store WHERE main_store_id = ?1",nativeQuery = true)
	 public List<SubStores> findByMainStoreId(@Param("main_store_id") String main_store_id);
}
