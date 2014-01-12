package com.workinprogress.workplanner.service;

import java.util.List;

import com.workinprogress.workplanner.model.Measurement;

public interface MeasurementService {
	Long saveMeasurement(Measurement measurement);

	List<Measurement> loadMeasurements();
}
