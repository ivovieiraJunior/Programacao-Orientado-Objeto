package Negocio;

public class Administrador extends Pessoa {
	
	private String email;
	private String ativo;
	
	public Administrador (String email, String atv) {
		this.email = email;
		this.ativo = atv;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

}
