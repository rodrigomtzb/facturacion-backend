package com.facturacion.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usersLogin")
public class UserLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userLoginID;
	
	@Column 
	private String userName;
	@Column
	private String password;
	
	@Column
	private Date cretionDate;
	@Column
	private String rolAccess;
	
	public Integer getUserLoginID() {
		return userLoginID;
	}
	public void setUserLoginID(Integer userLoginID) {
		this.userLoginID = userLoginID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCretionDate() {
		return cretionDate;
	}
	public void setCretionDate(Date cretionDate) {
		this.cretionDate = cretionDate;
	}
	public String getRolAccess() {
		return rolAccess;
	}
	public void setRolAccess(String rolAccess) {
		this.rolAccess = rolAccess;
	}
	
}
