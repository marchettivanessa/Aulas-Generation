package poo;

public class Paciente {
private String nomeP;
private String enderecoP;
private String idadeP;
private String diagnosticoP;

//construtor
public Paciente(String nome, String endereco, String idade, String diagnostico)
{
	nomeP=nome;
	enderecoP=endereco;
	idadeP = idade;
	diagnosticoP = diagnostico;
}

//metodos:

public String getCadastroPaciente()
{
	String cadastroPaciente = nomeP+ ", residente � "+ enderecoP + ", com idade de"+idadeP+" anos.\nDiagn�stico: "+diagnosticoP+".";
			return cadastroPaciente;
}
}
