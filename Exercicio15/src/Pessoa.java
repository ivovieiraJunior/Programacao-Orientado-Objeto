
public class Pessoa {
	
	private String nome;
	private String cpf;
	private String telefone;

	
	/**
	 * era pra fazer assim
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * tmb era pra fazer isso
	 * @param String nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "nome=" + nome + "\n cpf=" + cpf + "\n telefone=" + telefone;
	}
	
	
}
