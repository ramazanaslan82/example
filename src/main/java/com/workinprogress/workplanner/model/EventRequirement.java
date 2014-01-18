package com.workinprogress.workplanner.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class EventRequirement implements Serializable {

	private static final long serialVersionUID = 4401669292765831348L;

	@GeneratedValue
	@Id
	private long id;
	private Long measurementEventId;
	private Measurement measurement;
	private int pointCount;

	public Measurement getMeasurement() {
		return measurement;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMeasurement(Measurement measurement) {
		this.measurement = measurement;
	}

	public int getPointCount() {
		return pointCount;
	}

	public void setPointCount(int pointCount) {
		this.pointCount = pointCount;
	}

	public Long getMeasurementEventId() {
		return measurementEventId;
	}

	public void setMeasurementEventId(Long measurementEventId) {
		this.measurementEventId = measurementEventId;
	}

}
