package com.workinprogress.workplanner.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class City extends Location {

	public City() {
		super();
	}

	public City(Long id, String title) {
		super(id, title);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -6470815868920452305L;

	// No extra field exists for this object..

}
