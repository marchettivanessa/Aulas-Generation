package PacoteLogica;

import java.util.Scanner;

public class ArrayExercicio1 {
	public static void main(String args[])
	{
		int[] vetorA= {1,0,5,-2,-5,7};
		int soma=0;
		Scanner leia = new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			System.out.println(vetorA[i]);
			
		}
		soma=soma+vetorA[0]+vetorA[1]+vetorA[5];
		System.out.println("A soma das posi��es 0,1 e 5 do VetorA �: "+soma);
		vetorA[4]=100;
		for(int i=0;i<6;i++)
		{
			System.out.println(vetorA[i]);
			
		}
		
	}
}

/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. OK
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela
esta soma. OK
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/