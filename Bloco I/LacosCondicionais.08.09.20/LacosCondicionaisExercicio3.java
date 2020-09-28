package PacoteLogica;

import java.util.*;

public class LacosCondicionaisExercicio3 {
	public static void main(String args[])
	{
		
		int idade;
		String nome;
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com seu nome: ");
		nome = leia.nextLine();
		
		System.out.printf("Informe sua idade: ");
		idade = leia.nextInt();
		
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Você está no grupo infantil.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Você está no grupo juvenil.");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Você está no grupo adulto.");
		}
		else
		{
			System.out.println("Você não está em nenhum dos grupos existentes.");
		}
		
	}

}
