package PacoteLogica;

import java.util.Scanner;

public class LacosCondicionaisExercicio4
{

	public static void main(String[] args)
	{
		float num;
		double raizq, quad;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Por favor, insira um número");
		num = leia.nextFloat();
		
		if(num%2==0)
		{
			raizq = Math.sqrt(num);
			System.out.printf("Este número é par.");
			System.out.printf("\nA raiz quadrada deste número é: %f", raizq);
		}
		else
		{
			quad = Math.pow(num, 2);
			System.out.println("Este é um número ímpar.");
			System.out.println(num + " ao quadrado é: " + quad);
		}
	}

}
