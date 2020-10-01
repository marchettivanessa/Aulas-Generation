package com.minhasegundaaplicacao.segundaaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segunda")
public class SegundaAplicacao {
	
	@GetMapping
	public String segundaAplicacao()
	{
		return "Aprender sobre spring é meu principal objetivo da semana. Para isso, desenvolverei ainda mais minha habilidade de persistência.";
	}
}
