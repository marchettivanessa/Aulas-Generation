package poo;

public class Cliente {
	  //declaração dos atributos da classe
	  private String nomeCliente;
	  private String cidadeCliente;
	  private String telefoneCliente;
	 
	  /*//método construtor
	  public Cliente (String nome, String cidade, String telefone) {
	    this.nomeCliente = nome;
	    this.cidadeCliente = cidade;
	    this.telefoneCliente = telefone;
	  }*/     
	  
	  public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCidadeCliente() {
		return cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
}

