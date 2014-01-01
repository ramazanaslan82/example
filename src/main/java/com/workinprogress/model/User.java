package com.workinprogress.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "hbn_users")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 7158276443059514099L;

	@GeneratedValue
	@Id
	private Long id;

	@NotNull
	@Column(name = "user_name", length = 30)
	@Size(max = 30)
	private String username;

	@NotNull
	@Column(name = "password_hash")
	private String passwordHash;

	@Column(name = "first_name", length = 30)
	@Size(max = 30)
	private String firstName;

	@Column(name = "last_name", length = 30)
	@Size(max = 30)
	private String lastName;

	@Column(name = "profile")
	@Enumerated(EnumType.STRING)
	private UserProfile userProfile;

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private UserStatus status;

	@Embedded
	private Address address;

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
