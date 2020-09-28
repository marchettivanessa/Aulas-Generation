package poo;

public class Cavalo extends Animal{
	private String correrC;
	private String cavalgar;

	public Cavalo(String nome, int idade, String emiteSom)
	{
		super(nome, idade, emiteSom);
		this.correrC=correrC;
		this.cavalgar=cavalgar;
		
	}
	public String getCorrerC() {
		return correrC;
	}

	public void setCorrerC(String correrC) {
		this.correrC = correrC;
	}
	
	public String getNome() 
	{
		return "O nome do cavalo é: "+ super.getNome()+".";
	}
	
	public int getIdade() 
	{
		return super.getIdade();
	}
	
	public String getEmiteSom()
	{
		return "O som do cavalo é um "+super.getEmiteSom()+".";
	}
	
	public String getCavalgar() {
		return cavalgar;
	}
	public void setCavalgar(String cavalgar) {
		this.cavalgar = cavalgar;
	}
	public String cavalgar()
	{
		return "Um cavalor não corre, ele "+ correrC;
	}
}
