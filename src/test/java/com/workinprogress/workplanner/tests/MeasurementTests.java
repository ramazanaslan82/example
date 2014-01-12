package com.workinprogress.workplanner.tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.workinprogress.workplanner.model.Measurement;
import com.workinprogress.workplanner.model.MeasurementType;
import com.workinprogress.workplanner.service.MeasurementService;
import com.workinprogress.workplanner.service.MeasurementTypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(defaultRollback = false)
@ContextConfiguration(locations = { "classpath:appcontext/beans-*.xml" })
public class MeasurementTests {

	@Autowired
	private MeasurementTypeService measurementTypeService;

	@Autowired
	private MeasurementService measurementService;

	@Test
	public void testSaveMeasurement() {
		MeasurementType mediaMesurement = null;
		List<MeasurementType> measurementTypes = measurementTypeService
				.loadMeasurementTypes();
		for (MeasurementType measurementType : measurementTypes) {
			if (measurementType.getId().equals(1L)) {
				mediaMesurement = measurementType;
				break;
			}
		}
		Measurement measurement = new Measurement();
		measurement.setName("İç Ortam Gürültü Ölçümü");
		measurement.setMeasurementType(mediaMesurement);
		Long lastInsertId = measurementService.saveMeasurement(measurement);
		System.out.println("New measurement saved whith id:" + lastInsertId);
	}
}
