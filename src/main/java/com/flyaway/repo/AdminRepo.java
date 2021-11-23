package com.flyaway.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.flyaway.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, String>{
	
	
	@Transactional
	@Modifying
	@Query("UPDATE Admin SET password = :pass WHERE userId = :userid")
	public Integer updatPasswordByUserId(String pass,String userid);

}
