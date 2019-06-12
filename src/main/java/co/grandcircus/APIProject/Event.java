package co.grandcircus.APIProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Event {

	String type;
	String id; 
	String name;
	String url;
	
	public Event() {
		super();
	}

	public Event(String name, String id, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}
	public Event(String type, String id, String name, String url) {
		super();
		this.type = type;
		this.id = id;
		this.name = name;
		this.url = url;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Event [type=" + type + ", id=" + id + ", name=" + name + ", url=" + url + "]";
	}

	
}
