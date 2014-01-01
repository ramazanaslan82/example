package com.workinprogress.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hbn_phones")
public class Phone implements Serializable {

	private static final long serialVersionUID = 5684995188081654182L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "number")
	private String number;

	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private PhoneType type;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private PhoneStatus status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PhoneType getType() {
		return type;
	}

	public void setType(PhoneType type) {
		this.type = type;
	}

	public PhoneStatus getStatus() {
		return status;
	}

	public void setStatus(PhoneStatus status) {
		this.status = status;
	}
	
	
}
