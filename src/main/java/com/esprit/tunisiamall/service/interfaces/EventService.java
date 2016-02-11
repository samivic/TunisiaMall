package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.Event;

@Local
public interface EventService {

	Boolean addEvent(Event event);
	Boolean removeEvent(Event event);
	Boolean updateEvent(Event event);
	List<Event> findAllEvent();
	Event findEventById(Integer id);
}
