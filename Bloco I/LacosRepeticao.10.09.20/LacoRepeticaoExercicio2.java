package PacoteLogica;

import java.util.Scanner;

public class LacoRepeticaoExercicio2 {
	public static void main (String args[])
	{
		double i;
		int par=0, impar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=1;i<=10;i++)
		{
			
			System.out.println(i);
			
			if(i%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.println("O total de n�meros pares �: "+par);
		System.out.println("O total de n�meros �mpares �: "+ impar);
	}

}

/*2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. */