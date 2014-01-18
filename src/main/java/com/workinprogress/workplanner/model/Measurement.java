package com.workinprogress.workplanner.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hbn_measurements")
public class Measurement implements Serializable {

	private static final long serialVersionUID = -8062256136170089595L;

	@GeneratedValue
	@Id
	private Long id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "measurementTypeId")
	private MeasurementType measurementType;

	public MeasurementType getMeasurementType() {
		return measurementType;
	}

	public void setMeasurementType(MeasurementType measurementType) {
		this.measurementType = measurementType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
