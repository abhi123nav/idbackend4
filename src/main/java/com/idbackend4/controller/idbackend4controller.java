package com.idbackend4.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class idbackend4controller {

	
	@GetMapping("/cnames")
	public String getcnames()
	{
		return "Its working";
		}
}
