
public class ContaCorrente extends ContaBancario {
	
	private static double tavaOpere��o = 0;

	public  ContaCorrente(String nome, int numero, double saldo) {
		super(nome , numero , saldo);
		
	}

	@Override
	public void sacar(double valor) throws SaldoInsException {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			this.historico.add("Saque no valor de R$" + valor);
		}else {
			// lanca a exce�ao
			throw new SaldoInsException();
		}
	}

	@Override
	public void tranferir (ContaBancario conta, double valor) throws SaldoInsException{
		StringBuilder sb = new StringBuilder();
			this.sacar(valor);
			conta.saldo += valor;
			sb.append("Transferencia Concluida Com SUCESSO!!");
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	public static double getTavaOpere��o() {
		return tavaOpere��o;
	}

	public static void setTavaOpere��o(double tavaOpere��o) {
		ContaCorrente.tavaOpere��o = tavaOpere��o;
	}
	

}
