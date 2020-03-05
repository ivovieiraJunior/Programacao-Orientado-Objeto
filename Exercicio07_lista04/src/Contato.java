
public abstract class Contato {
	
	private String nome;
	private String email;
	private String telefone;
	private TipoContato contato;
	private TipoTelefone TipoTelefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public TipoContato getTipo() {
		return contato;
	}

	public void setTipo(TipoContato tipo) {
		this.contato = tipo;
	}

	public TipoContato getContato() {
		return contato;
	}

	public void setContato(TipoContato contato) {
		this.contato = contato;
	}

	public TipoTelefone getTipoTelefone() {
		return TipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.TipoTelefone = tipoTelefone;
	}
	
	
	
}
