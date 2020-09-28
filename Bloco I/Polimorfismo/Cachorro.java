package poo;

public class Cachorro extends Animal{
	private String correr;
	//private String idadeDh;
	
	public Cachorro(String nome, int idade, String emiteSom, String correr, String idadeDh)
	{
		super(nome, idade, emiteSom);
		this.correr=correr;
		//this.idadeDh=idadeDh;
	}

	/*public String getIdadeDh() {
		return idadeDh;
	}


	public void setIdadeDh(String idadeDh) {
		this.idadeDh = idadeDh;
	}*/

	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	}


	public String getNome()
	{
		return "O cachorro "+super.getNome()+ " corre quando chamamos seu nome!";
	}
	
	public String getEmiteSom()
	{
		return super.getEmiteSom()+" é o barulho emitido pelo cachorro.";
	}
	
	public int getIdade()
	{
		return super.getIdade();
	}
	/*public String idadeDh() 
	{
		idadeDh=(super.getIdade())*7;
		return idadeDh;
		System.out.println("A idade do cachorro "+ super.getNome()+" é de "+ this.idadeDh+" anos humanos.");
	}*/
	
}
