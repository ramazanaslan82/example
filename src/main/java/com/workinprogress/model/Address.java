package com.workinprogress.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Embeddable
public class Address implements Serializable {

	private static final long serialVersionUID = -5045018901474737108L;

	public Address() {
		super();
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@JoinColumn(name = "country_id")
	@OneToOne
	@MapsId
	private Country country;

	@JoinColumn(name = "city_id")
	@OneToOne
	@MapsId
	private City city;

	@JoinColumn(name = "town_id")
	@OneToOne
	@MapsId
	private Town town;

	@Column(name = "address_line", length = 255)
	@Size(max = 255)
	private String addressLine;

	@Column(name = "postal_code", length = 20)
	@Size(max = 20)
	private String postalCode;
}
