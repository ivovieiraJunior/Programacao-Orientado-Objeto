
public class ContaBancaria {
	 
	private int numero;
	private String titular;
	private float saldo;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria (String nome, int numero) {
		this.titular = nome;
		this.numero = numero;
		this.saldo = 0;
	}
	
	public void depositar(float deposito) {
		this.saldo += deposito;
	}
	
	public void sacar(float saque) throws SaqueExcecao {
		if(this.saldo < saque) {
			throw new SaqueExcecao();
		}
			this.saldo -= saque;		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "numero: " + numero + ", titular: " + titular + ", saldo: " + saldo;
	}
	
	
	
	

}
