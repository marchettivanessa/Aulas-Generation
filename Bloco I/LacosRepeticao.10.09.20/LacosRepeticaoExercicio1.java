package PacoteLogica;

import java.util.Scanner;

public class LacosRepeticaoExercicio1 {
	public static void main (String args[])
	{
		double num, i;
		Scanner leia = new Scanner(System.in);
		for(i=1; i<=1999; i++)
		{
			System.out.println("Insira um n�mero: ");
			num = leia.nextDouble();
			
			if(num%11==5)
			{
				System.out.println("\n" + num);
			}
			else
			{
				System.out.println("O resto da divis�o deste n�mero por 11 n�o � 5.");
			}
		}
	}

}

/*1-	Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. */