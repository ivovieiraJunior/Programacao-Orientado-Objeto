
public class Boleto extends MetodoPagamento{

	private Banco banco;
	
	public Boleto(Banco banco) {
		this.setBanco(banco);
	}
	
	@Override
	public String processarPagamento(float valor) {
		return "Pagamento no valor de " + valor + " realizado por meio de boleto no banco" +  this.banco ;
		
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}	
	
}
