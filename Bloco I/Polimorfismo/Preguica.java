package poo;

public class Preguica extends Animal{
	private String corre;

	public Preguica(String nome, int idade, String emiteSom, String corre)
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
