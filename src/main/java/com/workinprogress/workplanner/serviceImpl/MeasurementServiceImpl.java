package com.workinprogress.workplanner.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workinprogress.workplanner.dao.MeasurementDao;
import com.workinprogress.workplanner.model.Measurement;
import com.workinprogress.workplanner.service.MeasurementService;

@Service
public class MeasurementServiceImpl implements MeasurementService {

	@Autowired
	private MeasurementDao measurementDao;

	@Override
	public Long saveMeasurement(Measurement measurement) {
		return measurementDao.saveMeasurement(measurement);
	}

	@Override
	public List<Measurement> loadMeasurements() {
		return measurementDao.loadMeasurements();
	}

}
