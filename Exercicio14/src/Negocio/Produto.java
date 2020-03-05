package Negocio;

public class Produto {
	
	private String nome;
	private String descrição;
	private float valor;
	
	public Produto(String nome, String desc, float preço) {
		this.nome = nome;
		this.descrição = desc;
		this.valor = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	

}
