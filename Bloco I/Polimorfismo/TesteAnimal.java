package poo;

public class TesteAnimal {
	public static void main(String args[]) 
	{
		Cachorro dog = new Cachorro("fes", 9, "arf", "lento",null);
		dog.setNome("Amadeu");
		dog.setEmiteSom("latido");
		dog.setCorrer("pouco");
		
		Cavalo horse = new Cavalo("Gandalf", 10, null);
		horse.setNome("Julio");
		horse.setEmiteSom("relinchar");
		horse.setCorrerC("cavalgar");
		
		Preguica sloth = new Preguica("JO",2, "ouuwhnnn", "esc");
		sloth.setNome("Josefa");
		sloth.getEmiteSom();
		sloth.setSobeArvore("escala");
		
		Animal[] animals = new Animal[3];
		animals[0]=dog;
		animals[1]=horse;
		animals[2]=sloth;
		
		for(Animal i:animals) {
			System.out.println(i.getNome());
			System.out.println(i.getIdade());
			System.out.println(i.getEmiteSom());
		}
	}
}
