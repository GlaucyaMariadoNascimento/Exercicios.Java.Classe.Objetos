package br.com.generation.funcionario;

import java.util.Scanner;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario: ");
		String nome = input.next();
		
		System.out.println("Digite o cargo do funcionario: ");
		String cargo = input.next();
		
		System.out.println("Informe o salario do funcionario: ");
		double salario = input.nextDouble();
		
		System.out.println("Digite o c�digo do funcionario: ");
		String condigofunc = input.next();
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome(nome);
		f1.setCargo(cargo);
		f1.setSalario(salario);
		f1.setCodigofunc(condigofunc);
		
		System.out.println();
		System.out.println("Nome do funcion�rio: " + f1.getNome());
		System.out.println();
		System.out.println("Cargo do funcion�rio: " + f1.getCargo());
		System.out.println();
		System.out.println("Sal�rio do funcion�rio: " + f1.getSalario());
		System.out.println();
		System.out.println("Codigo de registro do funcion�rio: " + f1.getCodigofunc());
		input.close();
		
		
		
		
	}

}
