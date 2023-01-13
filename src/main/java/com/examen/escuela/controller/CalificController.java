package com.examen.escuela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calificaciones")
public class CalificController {
	

	@GetMapping("")
	public String show() {
		return "calificaciones/show";
	}

}
