package exercicio02;

public class Pessoa {
	/*
	 * (2,0) Faça um programa para representar a árvore genealógica de uma família. Para tal,
crie uma classe Pessoa que permita indicar, além de nome e idade, o pai e mãe. Tenha
em mente que pai e mãe também são do tipo Pessoa. Crie um método estático e
recursivo chamado mostraArvore na aplicação principal que recebe por parâmetro uma
Pessoa e mostra todas as gerações passadas. Implemente a aplicação principal testando
seus códigos
	 */
	
	private String nome;
	private int idade;
	private Pessoa pai;
	private Pessoa mae;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}

	@Override
	public String toString() {
		return "nome: " + this.nome + ", idade:" + this.idade + ", pai:" + this.pai.getNome() + ", mae:" + this.mae.getNome() + "\n" ;
	}
	
	
}
