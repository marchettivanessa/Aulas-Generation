package PacoteLogica;

import java.util.Scanner;

public class LacosCondicionaisExercicio1 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Entre com um segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Entre com um terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1>num3) 
		{
			System.out.println("O maior n�mero �: " + num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("O maior n�mero �: " + num2);
		}
		else 
		{
			System.out.println("O maior n�mero �: " + num3);
		}
		

	}

}
