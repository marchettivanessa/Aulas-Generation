package PacoteLogica;

import java.util.Scanner;

public class LacosCondicionaisExercicio4
{

	public static void main(String[] args)
	{
		float num;
		double raizq, quad;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Por favor, insira um n�mero");
		num = leia.nextFloat();
		
		if(num%2==0)
		{
			raizq = Math.sqrt(num);
			System.out.printf("Este n�mero � par.");
			System.out.printf("\nA raiz quadrada deste n�mero �: %f", raizq);
		}
		else
		{
			quad = Math.pow(num, 2);
			System.out.println("Este � um n�mero �mpar.");
			System.out.println(num + " ao quadrado �: " + quad);
		}
	}

}
