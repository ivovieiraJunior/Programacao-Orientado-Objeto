
public class ContaPoupanša extends ContaBancario{
	
	private double limite;

	public  ContaPoupanša(String nome, int numero, double saldo) {
		super(nome , numero , saldo);
		
	}

	@Override
	public void sacar(double valor) throws SaldoInsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tranferir(ContaBancario conta, double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

}
