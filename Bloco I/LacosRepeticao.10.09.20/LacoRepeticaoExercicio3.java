package PacoteLogica;

import java.util.Scanner;

public class LacoRepeticaoExercicio3 {
	public static void main(String args[])
	{
		int idade, i, menorid=0, maior50=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Entre com sua idade: ");
		idade = leia.nextInt();
		
		while(idade > -98)
		{
			System.out.println(idade);
			if(idade<21)
			{
				menorid++;
			}
			if (idade>50)
			{
				maior50++;
			}
			System.out.printf("Informe sua idade: ");
			idade= leia.nextInt();
		}
		
		System.out.printf("O total de pessoas abaixo de 21 anos é de: %d", menorid);
		System.out.printf("\nO total de pessoas acima de 50 anos é de: %d", maior50);
	}	

}

/*3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
 * O programa termina quando idade for =-99. */