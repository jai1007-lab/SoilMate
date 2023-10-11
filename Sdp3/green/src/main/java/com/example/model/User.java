
//
package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name =  "user_details", uniqueConstraints={@UniqueConstraint(columnNames={"username"})})
public class User 
{
	  @Id
//	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="Id")
	  private int id;
	
	  @Column(name="Email")
	  private String email;
	  
	  @Column(unique=true)
	  private String username;
	  
	  @Column
	  private String password;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	  
	  

}
//
