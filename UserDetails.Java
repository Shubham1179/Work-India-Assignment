package com.example.LibraryManagement.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "book_details")
public class BookDetails {
	
	@Id
	@Column(name= "userid")
	private String bookid;
	
	@Column(name = "pasword")
	private String booktitle;
	
	
	
	
	public String getuserid() {
		return userid;
	}
	public void setuserid(String bookid) {
		this.bookid = bookid;
	}
	public String getpasword() {
		return booktitle;
	}
	public void setpasword(String booktitle) {
		this.booktitle = booktitle;
	}

	public userdetails(String userid, String pasword) {
		super();
		this.userid = userid;
		this.pasword = pasword;
	}
	
	public userdetails(){
		
	}
	
	@Override
	public String toString() {
		return "userdetails [userid=" + bookid + ", pasword=" + pasword + "]";
	}
	
	
	
	

}
