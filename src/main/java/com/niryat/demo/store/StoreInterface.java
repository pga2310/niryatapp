package com.niryat.demo.store;

import org.springframework.data.jpa.repository.JpaRepository;
 

public interface StoreInterface extends JpaRepository<Store, String> {

}
