package com.workinprogress.workplanner.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;

@MappedSuperclass
public class Person implements Serializable {
	private static final long serialVersionUID = -8240531955447477630L;

	@GeneratedValue
	@Id
	private Long id;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
}
