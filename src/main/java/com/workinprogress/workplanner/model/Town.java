package com.workinprogress.workplanner.model;

import javax.persistence.Entity;

@Entity
public class Town extends Location {

	public Town() {
		super();
	}

	public Town(Long id, String title) {
		super(id, title);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -9012762900388340090L;

	// No extra field exists for this object..

}