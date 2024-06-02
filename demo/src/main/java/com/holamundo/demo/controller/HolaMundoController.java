package com.holamundo.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HolaMundoController {
	
	@GetMapping("/hola")
	public String hola() {
		return "Hola";
	}
	
}
