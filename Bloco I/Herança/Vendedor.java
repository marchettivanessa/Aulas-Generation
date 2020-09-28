package poo;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double salarioFinal;
	private double vencimentoLiquido;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String cpf, int telefone, int idade, double valorVendas, double salarioFinal, double vencimentoLiquido, double comissao) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.valorVendas=valorVendas;
		this.salarioFinal=salarioFinal;
		this.vencimentoLiquido=vencimentoLiquido;
		this.comissao=comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void salarioFinal()
	{
		salarioFinal=vencimentoLiquido+(valorVendas*0.15);
		System.out.println("O salário final d@ vendedor@ é de R$"+salarioFinal);
	}

	public void imprimirInfo (){
	    System.out.println("\nNome do empregado: "+getNome()+"\n"+"Cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+".");
	}
	
}
