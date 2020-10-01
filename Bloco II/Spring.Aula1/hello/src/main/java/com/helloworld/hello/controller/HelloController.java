package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String gethello()
	{
		return "Hello Generation!! As habilidades trabalhadas durante a execução do exercício são: persistência, mentalidade de crescimento e atenção aos detalhes";
	}
	
	
}
