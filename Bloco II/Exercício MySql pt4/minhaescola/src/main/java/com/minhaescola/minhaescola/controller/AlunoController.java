package com.minhaescola.minhaescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaescola.minhaescola.model.Aluno;
import com.minhaescola.minhaescola.repository.AlunoRepository;

@RestController //informa pro spring que essa classe é um controlador
@RequestMapping("/alunos") //define a uri para acessar essa classe
@CrossOrigin("*") //indica que essa classe aceita requisições de qualquer origem
public class AlunoController {

	@Autowired //possibilita o instanciamento dessa interface pelo controller
	private AlunoRepository repository;
	
	@GetMapping //método find all
	public ResponseEntity<List<Aluno>> getAllEntity(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") //método get by id
	public ResponseEntity<Aluno> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping //inserindo um dado
	public ResponseEntity<Aluno> post(@RequestBody Aluno aluno)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aluno));
	}
	
	@PutMapping //atualizando dados
	public ResponseEntity<Aluno> put(@RequestBody Aluno aluno){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
