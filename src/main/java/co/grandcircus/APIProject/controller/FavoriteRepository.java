package co.grandcircus.APIProject.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.grandcircus.APIProject.Event;

@Repository
public interface FavoriteRepository extends JpaRepository<User, String> {
	
	

}
