package com.codegnan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
	
	@RequestMapping(value="/petanimals")
	public String getWildAnimals() {
		return"petanimal";
	}
	@RequestMapping(value="/cat")
public String getCat() {
	return"cat";
}
	@RequestMapping(value="/dog")
	public String getDog() {
		return"dog";
	}
	@RequestMapping(value="/hen")
	public String getHen() {
		return"hen";
	}

	

	
}
