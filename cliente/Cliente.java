package br.com.generation.cliente;

public class Cliente {
	
	
	private String nome;
	private String sexo;
	private String cpf;
	private int idade; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getsexo() {
		return sexo;
	}
	public void setsexo(String sexo) {
		this.sexo = sexo;
	}

	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public int getidade() {
		return idade;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
}
