
public class Compra {
	
	private float valor;
	
	public Compra () {
		this.valor = 0;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void addItem (Produto produto, float qtd) {
		this.setValor(this.getValor() + ( produto.getValor()* qtd ));
	}
	
	public String realizarPagamento(MetodoPagamento mp) {
		return mp.processarPagamento(valor);
		
	}

}
