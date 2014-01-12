package com.workinprogress.workplanner.tests;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.workinprogress.workplanner.model.Device;
import com.workinprogress.workplanner.service.DeviceService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = { "classpath:appcontext/beans-*.xml" })
@TransactionConfiguration(defaultRollback = false)
public class DeviceTests {

	@Autowired
	private DeviceService deviceService;

	@Test
	public void testSaveDevice() {
		Device device = new Device();
		device.setName("NEFELOMETRE");
		Long lastInsertId = deviceService.saveDevice(device);
		System.out.println("New device saved with id:" + lastInsertId);
	}
}
