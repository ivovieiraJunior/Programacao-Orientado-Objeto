package Negocio;

public class Produto {
	
	private String nome;
	private String descri��o;
	private float valor;
	
	public Produto(String nome, String desc, float pre�o) {
		this.nome = nome;
		this.descri��o = desc;
		this.valor = pre�o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	

}
