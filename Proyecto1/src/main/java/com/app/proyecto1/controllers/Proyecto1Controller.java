package com.app.proyecto1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Proyecto1Controller {
@GetMapping("/")
public String holaMundo() {
	return "hola" + nombre;
}

@Value("${spring.application.name}")
private String nombre;
}
