
public class CartãoCredito extends MetodoPagamento {

	private Bandeira bandeira;
	private String numero;
	
	public CartãoCredito (Bandeira bandeira, String numero) {
		this.setBandeira(bandeira);
		this.numero = numero;
	}
	
	@Override
	public String processarPagamento(float valor) {
		return "Pagamento no valor de" + valor + "realizado por meio do cartão" + this.bandeira + "de número" + this.numero;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

}
