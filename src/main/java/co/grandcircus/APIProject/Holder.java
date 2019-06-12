package co.grandcircus.APIProject;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Holder {

	ArrayList<Event> events;

	public Holder() {
		super();
	}

	public Holder(ArrayList<Event> events) {
		super();
		this.events = events;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Holder [events=" + events + "]";
	}
	
	
}
