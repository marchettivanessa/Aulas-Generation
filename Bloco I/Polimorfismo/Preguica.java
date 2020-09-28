package poo;

public class Preguica extends Animal{
	private String sobeArvore;

	public Preguica(String nome, int idade, String emiteSom, String sobeArvore)
	{
		super(nome, idade, emiteSom);
		this.sobeArvore=sobeArvore;
		
	}
	public String getSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	public String getNome() 
	{
		return "O nome da preguiça: "+ super.getNome()+".";
	}
	
	public int getIdade() 
	{
		return super.getIdade();
	}
	
	public String getEmiteSom()
	{
		return "O som de uma preguiça é "+super.getEmiteSom()+".\nOu seja, pode ser qualquer coisa, já que ninguém realmente sabe o som que uma preguiça faz.";
	}
	
}
