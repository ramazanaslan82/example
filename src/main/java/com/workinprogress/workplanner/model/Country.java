package com.workinprogress.workplanner.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="hbn_countries")
public class Country extends Location {

	public Country() {
		super();
	}

	public Country(Long id, String title) {
		super(id, title);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -27080858508723653L;

	// No extra field exists for this object..

}
