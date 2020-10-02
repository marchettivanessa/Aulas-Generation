package poo;

public class Cavalo extends Animal{
	private String corre;

	public Cavalo(String nome, int idade, String emiteSom, String corre)
	{
		super(nome, idade, emiteSom);
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	

	
}
