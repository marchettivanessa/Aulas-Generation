package poo;

public class TesteVendedor {
	public static void main(String args[])
	{
		Vendedor jorel = new Vendedor("Jorel da Silva", "Rua das Margaridas, n915","25936471258", 985632568, 32,2000,3200,3700,48);
		Vendedor irmaoDoJorel = new Vendedor("Irmão do Jorel da Silva", "Rua dos Coqueiros, n97", "85639482697",978563214,29,2500,3800,2900,45);
		
		jorel.imprimirInfo();
		jorel.salarioFinal();
		irmaoDoJorel.imprimirInfo();
		irmaoDoJorel.salarioFinal();
		
	}
}
