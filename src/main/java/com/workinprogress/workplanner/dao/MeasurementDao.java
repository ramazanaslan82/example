package com.workinprogress.workplanner.dao;

import java.util.List;

import com.workinprogress.workplanner.model.Measurement;

public interface MeasurementDao {

	Long saveMeasurement(Measurement measurement);

	List<Measurement> loadMeasurements();
}
