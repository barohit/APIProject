package co.grandcircus.APIProject;

import java.util.ArrayList;

public class _Embedded {

	ArrayList<Event> events;

	public _Embedded() {
		super();
		// TODO Auto-generated constructor stub
	}

	public _Embedded(ArrayList<Event> events) {
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
		return "_Embedded [events=" + events + "]";
	}
	
}
