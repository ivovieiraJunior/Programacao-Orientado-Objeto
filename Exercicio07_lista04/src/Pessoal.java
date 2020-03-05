
public class Pessoal extends Contato {
	
	private String cpf;


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "\nNome:" + super.getNome()+ "\nCpf:" + this.getCpf()  + "\nEmail:" + super.getEmail() + "\nTelefone:" + super.getTelefone(); 
	}


	
}
