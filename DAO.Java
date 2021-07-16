package com.example.userdetails.DAO;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.userdetails.POJO.BookDetails;

@Repository
public interface DAO extends JpaRepository<userdetails, String>{
	
	@Query(value = "select * from userdetails nativeQuery = true)
	List<userdetails> check_a();
	
	

}