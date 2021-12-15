package br.com.generation.funcionario;

public class Funcionario {

	
	private String nome;
	private String cargo;
	private String codigofunc;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCodigofunc() {
		return codigofunc;
	}
	public void setCodigofunc(String codigofunc) {
		this.codigofunc = codigofunc;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
