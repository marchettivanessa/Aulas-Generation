package poo;

public class Funcionario {

	private String nomeFunc;
	private String cargoF;
	private String nivelC;
	private String sal;
	
	//constructor
	public Funcionario(String nome, String cargo, String nivel, String salario)
	{
		nomeFunc=nome;
		cargoF=cargo;
		nivelC=nivel;
		sal=salario;
	}

	public String getCadastro()
	{
		String cadastro = nomeFunc + ", " + cargoF + " " + nivelC + ", com salário de R$ " + sal + ".";
		return cadastro;
	
	}
	
	
	/*public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNivelC() {
		return nivelC;
	}

	public void setNivelC(String nivelC) {
		this.nivelC = nivelC;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}*/

}