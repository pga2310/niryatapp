package com.niryat.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
 

public interface StudentInterface extends JpaRepository<User, String> {

}
