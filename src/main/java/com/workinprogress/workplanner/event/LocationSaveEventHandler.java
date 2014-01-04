package com.workinprogress.workplanner.event;

import org.springframework.context.ApplicationListener;

public class LocationSaveEventHandler implements
		ApplicationListener<LocationSaveEvent> {

	@Override
	public void onApplicationEvent(LocationSaveEvent event) {
		System.out.println("---------------- Location data saved with id:"
				+ event.getLocationObject().getId());
	}

}
