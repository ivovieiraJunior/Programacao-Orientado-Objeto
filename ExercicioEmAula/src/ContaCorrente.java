
public class ContaCorrente extends ContaBancario {
	
	private static double tavaOpereção = 0;

	public  ContaCorrente(String nome, int numero, double saldo) {
		super(nome , numero , saldo);
		
	}

	@Override
	public void sacar(double valor) throws SaldoInsException {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			this.historico.add("Saque no valor de R$" + valor);
		}else {
			// lanca a exceçao
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

	public static double getTavaOpereção() {
		return tavaOpereção;
	}

	public static void setTavaOpereção(double tavaOpereção) {
		ContaCorrente.tavaOpereção = tavaOpereção;
	}
	

}
