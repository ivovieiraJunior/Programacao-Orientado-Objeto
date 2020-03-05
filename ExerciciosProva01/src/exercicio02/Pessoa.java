package exercicio02;

public class Pessoa {
	/*
	 * (2,0) Fa�a um programa para representar a �rvore geneal�gica de uma fam�lia. Para tal,
crie uma classe Pessoa que permita indicar, al�m de nome e idade, o pai e m�e. Tenha
em mente que pai e m�e tamb�m s�o do tipo Pessoa. Crie um m�todo est�tico e
recursivo chamado mostraArvore na aplica��o principal que recebe por par�metro uma
Pessoa e mostra todas as gera��es passadas. Implemente a aplica��o principal testando
seus c�digos
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
