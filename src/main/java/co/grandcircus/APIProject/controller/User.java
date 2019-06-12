package co.grandcircus.APIProject.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userfavorites")
public class User {
	
	String eventname; 
	String url; 
	Integer userid;
	@Id
	String eventid;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String eventname, String url, String eventid) {
		super();
		this.eventname = eventname;
		this.url = url;
		this.eventid = eventid;
	}
	
	public String getEventid() {
		return eventid;
	}

	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	
	public User(String eventname, String url, Integer userid) {
		super();
		this.eventname = eventname;
		this.url = url;
		this.userid = userid;
	}
	
	public String getEventname() {
		return eventname;
	}
	
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Integer getUserid() {
		return userid;
	}
	
	public void setUserid(Integer userid) {
		this.userid = userid;
	} 
	
	

}
