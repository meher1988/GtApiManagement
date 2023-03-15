package com.meher.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity()
@Table(name="T_users")
public class Users {
	
	@Id
 	@Column(name="ID")
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="CLEARPASSWORD")
	private String clearPassword;
	
    @Column(name="UPDATED_BY")
    private String updatedBy;
    
    //@Formula("(SELECT (id+1) FROM T_users WHERE ROWNUM = 1 ORDER BY id DESC;)")
    @Column(name="role")
    private String role;

	public Users() {
		super();
	}

	public Users(Integer id, String name, String username, String password, String clearPassword, String updatedBy,
			String role) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.clearPassword = clearPassword;
		this.updatedBy = updatedBy;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getClearPassword() {
		return clearPassword;
	}

	public void setClearPassword(String clearPassword) {
		this.clearPassword = clearPassword;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", clearPassword=" + clearPassword + ", updatedBy=" + updatedBy + ", role=" + role + "]";
	}

    
    
    
}
