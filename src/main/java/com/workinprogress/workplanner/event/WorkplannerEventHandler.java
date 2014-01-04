package com.workinprogress.workplanner.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

import com.workinprogress.workplanner.model.Location;

public class WorkplannerEventHandler implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ContextRefreshedEvent) {
			System.out.println("********************* context refresh");
		} else if (event instanceof ContextClosedEvent) {
			System.out.println("********************* context closed");
		} else if ( event instanceof LocationSaveEvent) {
			System.out.println("********************* ");
			Location location = ((LocationSaveEvent) event).getLocationObject();
			System.out.println("********************* Wrote location data. Title:"+location.getTitle()+" with id:" + location.getId());
		}
	}
	
	
}
