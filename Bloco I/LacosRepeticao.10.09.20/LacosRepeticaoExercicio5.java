package PacoteLogica;

import java.util.Scanner;

public class LacosRepeticaoExercicio5
{
	public static void main(String args[])
	{
		int num, soma=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Entre com um número: ");
		num = leia.nextInt();
		do
		{
			soma=soma+num;
			System.out.printf("Entre com um número: ");
			num = leia.nextInt();
		}
		while(num != 0);
		
		System.out.printf("A soma dos valores digitados é: %d",soma);
	}

}
