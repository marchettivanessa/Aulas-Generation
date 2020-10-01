package com.helloparte2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class Hello2Controller 
{
	@GetMapping
	public String hello2()
	{
		return "Mentalidade de crescimento, persistência, orientação ao futuro e atenção aos detalhes são os lemas da minha vida durante o bootcamp. Ainda bem.\nDá-lhe Generation!";
	}
}
