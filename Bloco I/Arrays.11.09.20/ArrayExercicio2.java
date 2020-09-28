package PacoteLogica;

import java.util.Scanner;

public class ArrayExercicio2 {
	public static void main(String args[])
	{
		int[] num = new int[6];
		int somapar=0, nimpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Entre com um número inteiro: ");
			num[i]=leia.nextInt();
			
		}
		
		System.out.println("Números pares digitados: ");
		for(int i=0;i<6;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
				somapar=somapar+num[i];
			}
		}
		System.out.println("Números ímpares digitados: ");
		for(int i=0;i<6;i++)
		{
			if(num[i]%2!=0)
			{
			
				System.out.println(num[i]);
				nimpar++;
			}
		}
		System.out.println("\nA soma dos números pares digitados é de: "+somapar);
		System.out.println("\nA quantidade de números ímpares digitados é de: "+nimpar);
		
	}

}
