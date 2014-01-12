package com.workinprogress.workplanner.service;

import java.util.List;

import com.workinprogress.workplanner.model.MeasurementType;

public interface MeasurementTypeService {
	Long saveMeasurementType(MeasurementType measurementType);

	List<MeasurementType> loadMeasurementTypes();
}
