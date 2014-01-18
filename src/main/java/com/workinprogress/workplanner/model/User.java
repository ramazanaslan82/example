package com.workinprogress.workplanner.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "hbn_users")
public class User extends Person implements java.io.Serializable {

	private static final long serialVersionUID = 7158276443059514099L;

	@NotNull
	@Column(name = "user_name", length = 30)
	@Size(max = 30)
	private String username;

	@NotNull
	@Column(name = "password_hash")
	private String passwordHash;

	@Embedded
	private Address address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User() {
	}

	public User(String username) {
		this.username = username;
	}
}
