
public class Cart�oCredito extends MetodoPagamento {

	private Bandeira bandeira;
	private String numero;
	
	public Cart�oCredito (Bandeira bandeira, String numero) {
		this.setBandeira(bandeira);
		this.numero = numero;
	}
	
	@Override
	public String processarPagamento(float valor) {
		return "Pagamento no valor de" + valor + "realizado por meio do cart�o" + this.bandeira + "de n�mero" + this.numero;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

}
