package PacoteLogica;

import java.util.Scanner;

public class LacosRepeticaoExercicio4 {
	public static void main(String args[])
	{
		int idade, nmaior40=0, cmenor18=0, magres=0, ocalmo=0,mnervosa=0, masc=0, fem=0, outro=0, sexo, humor=0, npessoas=1;
		Scanner leia = new Scanner(System.in);
				
		while(npessoas<4)
		{
			System.out.println("Entre com sua idade: ");
			idade = leia.nextInt();
			System.out.println("Informe o sexo: 1)Feminino, 2)Masculino ou, 3)Outros ");
			sexo = leia.nextInt();
			System.out.println("Informe se voc� � 1)Calmo, 2)Nervoso, ou 3)Agressivo: ");
			humor = leia.nextInt();
			
			if(humor==1)
			{
				humor=humor+1;
			}
			if(sexo==1 && humor==2)
			{
				mnervosa++;
			}
			if(sexo == 2 && humor ==3)
			{
				magres++;
			}
			if(sexo==3 && humor==1)
			{
				ocalmo++;
			}
			
			if(idade>40 && humor==2)
			{
				nmaior40++;
			}
			if(idade<18 && humor==1)
			{
				cmenor18++;
			}
			npessoas++;
		}
		
		System.out.println("\nO n�mero de pessoas calmas � de: "+ humor);
		System.out.println("\nO n�mero de mulheres nervosas � de: "+ mnervosa);
		System.out.println("\nO n�mero de homens agressivos � de: "+magres);
		System.out.println("\nO n�mero de pessoas outros calmos � de: "+ ocalmo);
		System.out.println("\nO n�mero de pessoas nervosas acima de 40 anos � de: "+nmaior40);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos � de: "+cmenor18);
	}

}