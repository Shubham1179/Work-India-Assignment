package com.example.LibraryManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagement.DAO.DAO;
import com.example.LibraryManagement.POJO.userdetails;

@Service
public class NewServiceImpl implements NewService{
	
	@Autowired
	DAO dao;

	@Override
	public List<UserDetails> check_available() {
				
		List<UserDetails> lb = dao.check_a();
		return lb;
	}

}
