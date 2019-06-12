package co.grandcircus.APIProject.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.APIProject.Event;


@Controller
public class EventContoller {

	@Value("${events.key}")
	String eventKey;
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView index() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("x-api-key", eventKey);
		headers.add("Accept",MediaType.APPLICATION_JSON_VALUE);
		
		
		String url="https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&apikey="+eventKey;
		ResponseEntity<Event> response = rt.exchange(url,HttpMethod.GET, new HttpEntity<>("paramters", headers), Event.class);
			
		return new ModelAndView("index","events", response.getBody());
	}
}
