package Negocio;

public class Pessoa {
	private String nome;
	private String sobreNome;
	private char[] cpf;

	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String SobNome, char []cpf) {
		this.nome = nome;
		this.sobreNome = SobNome;
		this.setCpf(cpf);
	}

	public char[] getCpf() {
		return cpf;
	}

	public void setCpf(char[] cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
}

	