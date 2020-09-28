package PacoteLogica;

import java.util.Scanner;

public class LacosRepeticaoExercicio6 {
	public static void main(String args[])
	{
		int num, mult3=0, contador=0, media=0;
		
		Scanner leia = new Scanner(System.in);

		do
		{
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
			if(num%3==0 && num !=0)
			{
				mult3=mult3+num;
				contador++;
			}
	
		}
		while(num!=0);
		media=mult3/contador;
		
		System.out.println("A média de valores digitados(que são múltiplos de 3) é: "+media);
	}

}
