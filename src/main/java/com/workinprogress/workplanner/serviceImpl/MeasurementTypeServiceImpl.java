package com.workinprogress.workplanner.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workinprogress.workplanner.dao.MeasurementTypeDao;
import com.workinprogress.workplanner.model.MeasurementType;
import com.workinprogress.workplanner.service.MeasurementTypeService;

@Service
public class MeasurementTypeServiceImpl implements MeasurementTypeService {

	@Autowired
	private MeasurementTypeDao measurementTypeDao;

	@Override
	public Long saveMeasurementType(MeasurementType measurementType) {
		return measurementTypeDao.saveMeasurementType(measurementType);
	}

	@Override
	public List<MeasurementType> loadMeasurementTypes() {
		return measurementTypeDao.loadTypes();
	}

}
