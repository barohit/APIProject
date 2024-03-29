package co.grandcircus.APIProject.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.APIProject.EmbeddedHolder;


@Controller
public class EventContoller {

	@Value("${events.key}")
	String eventKey;
	
	@Autowired
	FavoriteRepository fr;
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView index() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("x-api-key", eventKey);
		headers.add("Accept",MediaType.APPLICATION_JSON_VALUE);
		
		
		String url="https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&apikey="+eventKey;
		ResponseEntity<EmbeddedHolder> response = rt.exchange(url,HttpMethod.GET, new HttpEntity<>("paramters", headers), EmbeddedHolder.class);
			
		System.out.println(response.getBody().get_embedded().getEvents());
		return new ModelAndView("index","events", response.getBody().get_embedded().getEvents());
	}
	
	@RequestMapping("favorite")
	public ModelAndView favorite(HttpSession session, @RequestParam("name") String name, @RequestParam("url") String url, @RequestParam("id") String id) {
		String sessionid = session.getId(); 
		fr.save(new User(name, url, id, sessionid));
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("seefavorites")
	public ModelAndView getFavorites() {
		
		return new ModelAndView("favorites","listFavorites", fr.findAll());
	}
	
}
