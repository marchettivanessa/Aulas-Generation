package poo;

public class Administrador extends Pessoa{
	private double ajudaDeCusto;
	private double transporte;
	private double comida;
	private double valorDiaria; 
	private double somaAjuda;
	private int diasViagem;
	
	//construtor
	public Administrador(String nome, String endereco, String cpf, int telefone, int idade, double ajudaDeCusto, double transporte, double comida, double valorDiaria, int diasViagem) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.ajudaDeCusto = ajudaDeCusto;
		this.transporte=transporte;
		this.comida=comida;
		this.valorDiaria=valorDiaria;
		this.diasViagem=diasViagem;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public double getTransporte() {
		return transporte;
	}

	public void setTransporte(double transporte) {
		this.transporte = transporte;
	}

	public double getComida() {
		return comida;
	}

	public void setComida(double comida) {
		this.comida = comida;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public double getSomaAjuda() {
		return somaAjuda;
	}

	public void setSomaAjuda(double somaAjuda) {
		this.somaAjuda = somaAjuda;
	}

	public int getDiasViagem() {
		return diasViagem;
	}

	public void setDiasViagem(int diasViagem) {
		this.diasViagem = diasViagem;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//metodos
	public void ajudaDeCusto()
	{
		somaAjuda=transporte+((comida+valorDiaria)*diasViagem);
		System.out.println("O valor da ajuda de custo é de: "+somaAjuda+".");
	}
	public void imprimirInfo (){
	    System.out.println("\nNome do administrador: "+getNome()+"\n"+"Cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+".");
	}
	
}
