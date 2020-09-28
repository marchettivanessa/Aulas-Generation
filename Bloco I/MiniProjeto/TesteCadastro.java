package projeto1;

public class TesteCadastro {
	public static void main(String args[]) {
		Paciente paciente1= new Paciente ("Henrique", "123456", "07:50", 20, "Joaquim", "Clinico Geral", 5, "amarelo", "medica��o oral", "amidalite");
		Medico medico1= new Medico ("Joaquim", "789456", "06:00", 50, 12348, "Manh�", "Clinico Geral");
		
		paciente1.listaPlano();
		System.out.println(paciente1.tipoPlano(paciente1.getPlano()));
		System.out.println();
		
		paciente1.infoConsulta();
		paciente1.gravidade(paciente1.getNivelPrioridade());
		
		System.out.println();
		System.out.println(medico1.getInfoMedico());
		System.out.println();
		System.out.println("O m�dico "+medico1.getNome()+ " ir� atender o paciente " +paciente1.getNome()+ " no hor�rio agendado: " +paciente1.getHora());
		System.out.println();
		System.out.println(medico1.getAtestado(paciente1.getNivelPrioridade()));
	}
}