package com.workinprogress.workplanner.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workinprogress.workplanner.dao.DeviceDao;
import com.workinprogress.workplanner.model.Device;
import com.workinprogress.workplanner.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceDao deviceDao;
	
	@Override
	public Long saveDevice(Device device) {
		return deviceDao.saveDevice(device);
	}

	@Override
	public List<Device> loadAllDevices() {
		// TODO Auto-generated method stub
		return null;
	}

}
