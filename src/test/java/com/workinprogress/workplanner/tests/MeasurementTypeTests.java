package com.workinprogress.workplanner.tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.workinprogress.workplanner.model.MeasurementType;
import com.workinprogress.workplanner.service.MeasurementTypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(defaultRollback = false)
@ContextConfiguration(locations = { "classpath:appcontext/beans-*.xml" })
public class MeasurementTypeTests {

	@Autowired
	private MeasurementTypeService measurementTypeService;

	@Test
	public void testSaveMeasurementType() {
		MeasurementType measurementType = new MeasurementType();
		measurementType.setName("Gürültü Ölçümü");
		Long lastInsertId = measurementTypeService
				.saveMeasurementType(measurementType);
		System.out
				.println("New measurementType saved whith id:" + lastInsertId);
	}

	@Test
	public void testLoadMeasurementTypes() {
		List<MeasurementType> types = measurementTypeService.loadMeasurementTypes(); 
		if(types.size()>0)
		{
			System.out.println(types.size() + " adet olcum tipi yuklendi...");
		}
		else
		{
			System.out.println("Olcum tipi gozlemlenemedi...");
		}
	}

}
