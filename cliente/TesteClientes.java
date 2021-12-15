package br.com.generation.cliente;

import java.util.Scanner;

public class TesteClientes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do(a) cliente: ");
	    String nome = input.next();
	    
	    System.out.println("Digite o idade do(a) cliente:  ");
	    int idade = input.nextInt();
	    
	    System.out.println("Digite o genero do(a) cliente:  ");
	    String sexo = input.next();
	    
	    System.out.println("Digite o CPF do(a) cliente:  ");
	    String cpf = input.next();
	    
	   
	    Cliente c1 = new Cliente();
	    
	    c1.setNome (nome);
	    c1.setidade(idade);
	    c1.setsexo (sexo);
	    c1.setcpf  ( cpf);
	    
	    
	    System.out.println("O(A) cliente: " + c1.getNome());
	    System.out.println("Tem " + c1.getidade() + "anos");
	    System.out.println("É do genero: " + c1.getsexo());
	    System.out.println("Portador(a) do CPF: " + c1.getcpf());
	    input.close();

	}

}
