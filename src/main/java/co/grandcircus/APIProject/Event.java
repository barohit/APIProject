package co.grandcircus.APIProject;

public class Event {

	String type;
	String id; 
	String name; 
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Event(String type) {
		super();
		this.type = type;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Event [type=" + type + ", id=" + id + ", name=" + name + "]";
	} 
	
	
	
}
