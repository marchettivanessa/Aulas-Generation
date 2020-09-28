package PacoteLogica;

import java.util.Scanner;

public class ArrayExercicio3 {
	public static void main(String args[])
	{
		int[][] matriz= new int[3][3];
		int maior10 = 0, linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Insira o valor da matriz[%d][%d]: ",linha+1, coluna+1);
				matriz[linha][coluna]= leia.nextInt();
				
				if(matriz[linha][coluna]>10)
				{
					maior10++;
				}
			}
		}
		System.out.printf("\nValores maiores que 10: %d", maior10);
	}

}

/* Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/