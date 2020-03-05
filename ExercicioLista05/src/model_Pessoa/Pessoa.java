package model_Pessoa;
/**
 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus
 * respectivos seletores (getters) e modificadores (setters), e ainda o
 * construtor padrão e pelo menos mais duas opções de construtores conforme sua
 * percepção. Atributos: String nome; String endereço; String telefone;
 * 
 * @author ivovi
 *
 */

public class Pessoa {

	private String nome;
	private String endereço;
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
	 * @param String Endereço
	 * @param String Telefone
	 */
	public Pessoa(String Nome, String Endereço, String Telefone) {
		this.nome = Nome;
		this.endereço = Endereço;
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
	 * @return String Endereço
	 */
	public String getEndereço() {
		return endereço;
	}

	/**
	 * 
	 * @param String endereço
	 */
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
		return "Nome:" + nome + "\nEndereço:" + endereço + "\nTelefone:" + telefone + "\n";
	}

}
