package com.workinprogress.workplanner.dao;

import java.util.List;

import com.workinprogress.workplanner.model.MeasurementType;

public interface MeasurementTypeDao {

	Long saveMeasurementType(MeasurementType measurementType);

	List<MeasurementType> loadTypes();

}
