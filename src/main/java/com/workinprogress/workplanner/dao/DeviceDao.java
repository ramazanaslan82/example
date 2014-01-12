package com.workinprogress.workplanner.dao;

import java.util.List;

import com.workinprogress.workplanner.model.Device;

public interface DeviceDao {

	Long saveDevice(Device device);

	List<Device> loadAllDevices();
}
