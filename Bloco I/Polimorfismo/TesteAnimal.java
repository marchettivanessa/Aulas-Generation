package poo;

public class TesteAnimal {
	public static void main(String args[]) 
	{
		Cachorro dog = new Cachorro("Legolas", 9, "arf", "o dog corre");
		
		Cavalo horse = new Cavalo("Gandalf", 10, "ririri", "ele cavalga");
		
		
		Preguica sloth = new Preguica("Cibele",2, "ouuwhnnn", "ela dorme abraçadinha na árvore");
		
		Animal[] animals = new Animal[3];
		animals[0]=dog;
		animals[1]=horse;
		animals[2]=sloth;
		
		for(Animal i:animals) {
			System.out.println(i.getEmiteSom());
		}	
}
}