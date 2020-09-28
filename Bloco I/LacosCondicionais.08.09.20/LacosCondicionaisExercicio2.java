package PacoteLogica;

import java.util.Scanner;

public class LacosCondicionaisExercicio2 {
	public static void main(String args[])
	{
		float num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Por favor, insira um número: ");
		num1 = leia.nextFloat();
		System.out.printf("Por favor, insira um segundo número: ");
		num2 = leia.nextFloat();
		System.out.printf("Por favor, insira um terceiro número: ");
		num3 = leia.nextFloat();
		
		if(num1> num2 && num1> num3 && num2>= num3)
		{
			System.out.println("Seguem os números em ordem crescente: " + num3 + ", " + num2 + " e " + num1 + ".");//n3,n2,n1
		}
		else if(num2>=num1 && num2>=num3 && num1>=num3)
		{
			System.out.println("Seguem os números em ordem crescente: " + num3 + ", " + num1 + " e " + num2 + ".");//n3,n1,n2
		}
		else if(num3>=num2 && num3>= num1 & num1>=num2)
		{
			System.out.println("Seguem os números em ordem crescente: "+num2 + ", "+ num1 + " e "+ num3+ ".");//n2,n1,n3
		}
		else if(num1>=num3 && num1>=num2 && num3>=num2)
		{
			System.out.println("Seguem os números em ordem crescente: "+num2 + ", "+ num3 + " e "+ num1+ ".");//n2,n3,n1
		}
		else if(num3>=num1 && num3>=num2 && num2>=num1)
		{
			System.out.println("Seguem os números em ordem crescente: "+num1 + ", "+ num2 + " e "+ num3+ ".");//n1,n2,n3
		}
		else if(num2>=num1 &&num2>=num3 & num3>=num1)
		{
			System.out.println("Seguem os números em ordem crescente: "+num1 + ", "+ num3 + " e "+ num2+ ".");//n1,n3n2
		}
	}

}

