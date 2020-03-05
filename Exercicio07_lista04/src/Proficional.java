
public class Proficional extends Contato {
	
	private String NomeEmpresa;

	public String getNomeEmpresa() {
		return this.NomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.NomeEmpresa = nomeEmpresa;
	}

	@Override
	public String toString() {
		return "\nNome:" + super.getNome() + "\nEmail:" + super.getEmail() + "\nTelefone:" + super.getTelefone() + "\nEmpresa:" + this.getNomeEmpresa();
		
	}
	

}
