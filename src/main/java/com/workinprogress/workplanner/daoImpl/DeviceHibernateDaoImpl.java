package com.workinprogress.workplanner.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workinprogress.workplanner.dao.DeviceDao;
import com.workinprogress.workplanner.model.Device;

@Repository
public class DeviceHibernateDaoImpl implements DeviceDao {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long saveDevice(Device device) {
		sessionFactory.getCurrentSession().save(device);
		return device.getId();
	}

	@Override
	public List<Device> loadAllDevices() {
		// TODO Auto-generated method stub
		return null;
	}

}
