package PacoteLogica;

import java.util.Scanner;

public class LacosCondicionaisExercicio1 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		num1 = leia.nextInt();
		System.out.println("Entre com um segundo número: ");
		num2 = leia.nextInt();
		System.out.println("Entre com um terceiro número: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1>num3) 
		{
			System.out.println("O maior número é: " + num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("O maior número é: " + num2);
		}
		else 
		{
			System.out.println("O maior número é: " + num3);
		}
		

	}

}
