package com.workinprogress.workplanner.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hbn_companies")
public class Company implements Serializable {

	private static final long serialVersionUID = 981031978752073326L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@ManyToMany
	@JoinTable(name = "hbn_users")
	private List<User> authorizedUsers;

	@ManyToMany
	@JoinTable(name = "hbn_users")
	private List<User> accountManagers;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Country country;

	@ManyToOne
	@JoinColumn(name = "id")
	private City city;

	@ManyToOne
	@JoinColumn(name = "id")
	private Town town;

	private String addressLine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<User> getAuthorizedUsers() {
		return authorizedUsers;
	}

	public void setAuthorizedUsers(List<User> authorizedUsers) {
		this.authorizedUsers = authorizedUsers;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public List<User> getAccountManagers() {
		return accountManagers;
	}

	public void setAccountManagers(List<User> accountManagers) {
		this.accountManagers = accountManagers;
	}

}
