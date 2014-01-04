package com.workinprogress.workplanner.event;

import org.springframework.context.ApplicationEvent;

import com.workinprogress.workplanner.model.Location;

public class LocationSaveEvent extends ApplicationEvent {

	private Location locationObject;
	
	public LocationSaveEvent(Object source, Location location) {
		super(source);
		this.locationObject = location;
	}

	public Location getLocationObject() {
		return locationObject;
	}
}
