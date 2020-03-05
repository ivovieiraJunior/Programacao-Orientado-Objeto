package model_Pessoa;
/**
 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus
 * respectivos seletores (getters) e modificadores (setters), e ainda o
 * construtor padr�o e pelo menos mais duas op��es de construtores conforme sua
 * percep��o. Atributos: String nome; String endere�o; String telefone;
 * 
 * @author ivovi
 *
 */

public class Pessoa {

	private String nome;
	private String endere�o;
	private String telefone;

	public Pessoa() {

	}

	/**
	 * Construtor Simples Apenas o Nome.
	 * 
	 * @param String
	 */

	public Pessoa(String Nome) {
		this.nome = Nome;
	}

	/**
	 * Construto Completo Com todos os Atributos de Pessoa.
	 * 
	 * @param String Nome
	 * @param String Endere�o
	 * @param String Telefone
	 */
	public Pessoa(String Nome, String Endere�o, String Telefone) {
		this.nome = Nome;
		this.endere�o = Endere�o;
		this.telefone = Telefone;
	}

	/**
	 * Retorna uma String Do tipo Nome.
	 * 
	 * @return String Nome.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param String nome.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return String Endere�o
	 */
	public String getEndere�o() {
		return endere�o;
	}

	/**
	 * 
	 * @param String endere�o
	 */
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	/**
	 * 
	 * @return String Telefone.
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * 
	 * @param String telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + "\nEndere�o:" + endere�o + "\nTelefone:" + telefone + "\n";
	}

}
