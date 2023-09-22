package com.test.test.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class MemberDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeq")
	@SequenceGenerator(name = "mySeq", sequenceName = "test_member_seq", allocationSize = 1)
	private int id;
	private String loginid;
	private String password;
	private String name;
	private String birth;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", loginid=" + loginid + ", password=" + password + ", name=" + name + ", birth="
				+ birth + ", gender=" + gender + "]";
	}
	
	
}
