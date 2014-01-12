package com.workinprogress.workplanner.service;

import java.util.List;

import com.workinprogress.workplanner.model.Device;

public interface DeviceService {

	Long saveDevice(Device device);

	List<Device> loadAllDevices();

}
