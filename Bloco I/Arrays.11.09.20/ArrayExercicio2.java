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
			System.out.println("Entre com um n�mero inteiro: ");
			num[i]=leia.nextInt();
			
		}
		
		System.out.println("N�meros pares digitados: ");
		for(int i=0;i<6;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
				somapar=somapar+num[i];
			}
		}
		System.out.println("N�meros �mpares digitados: ");
		for(int i=0;i<6;i++)
		{
			if(num[i]%2!=0)
			{
			
				System.out.println(num[i]);
				nimpar++;
			}
		}
		System.out.println("\nA soma dos n�meros pares digitados � de: "+somapar);
		System.out.println("\nA quantidade de n�meros �mpares digitados � de: "+nimpar);
		
	}

}
