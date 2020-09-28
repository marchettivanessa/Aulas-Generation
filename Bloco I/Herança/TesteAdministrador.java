package poo;

public class TesteAdministrador {
	public static void main(String args[])
	{
		Administrador adm1 = new Administrador("Bilbo Bolseiro","Rua do Condado, n91","15823698752", 918563958, 50, 4000,350,300,150,3);
		Administrador adm2 = new Administrador("Legolas","Avenida Lothlórien, n1000", "58963152896", 914586239, 27, 500,450,250,110,3);
		
		adm1.imprimirInfo();
		adm1.ajudaDeCusto();
		adm2.imprimirInfo();
		adm2.ajudaDeCusto();
	}
}

