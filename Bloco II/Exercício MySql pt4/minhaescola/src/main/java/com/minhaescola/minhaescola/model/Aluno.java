package com.minhaescola.minhaescola.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //indica que a classe vai ser uma entidade do jpa hibernate
@Table(name = "aluno") //indica que essa entidade será uma tabela dentro do banco de dados, cujo nome será aluno
public class Aluno {
	
	@Id //indica que é o id do aluno
	@GeneratedValue(strategy = GenerationType.IDENTITY) //ou seja, no BD esse atributo será uma PK
	private long id;
	
	@NotNull //o campo não poderá ficar vazio
	@Size(min=3, max=50)
	private String nome;
	
	@NotNull
	private boolean matriculado;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
}
