package poo;

public class Cliente1 {
public static void main(String args[])
{
	
    Cliente clienteA = new Cliente();
    clienteA.setNomeCliente("Manuel");
    clienteA.setCidadeCliente("Ourinhos");
    clienteA.setTelefoneCliente("999999-9999");
    System.out.println(clienteA.getNomeCliente());
    System.out.println(clienteA.getCidadeCliente());
    System.out.println(clienteA.getTelefoneCliente());
    
}
}

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as
 * instancias deste objeto e apresente as informações deste objeto no console.*/
 