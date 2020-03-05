import java.util.ArrayList;
import java.util.Calendar;

public abstract class ContaBancario {
	
	protected ArrayList <String> historico;
	private int numero;
	private String titular;
	protected double saldo;
	
	
	public ContaBancario () {
		
	}
	
	public ContaBancario (String nome, int numero, double saldo) {
		this.titular = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.historico = new ArrayList<String>();
		this.historico.add("Criada em: " + Calendar.getInstance().getTime());
	}
	
	public abstract void sacar(double valor) throws SaldoInsException;
	
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
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public ArrayList <String> getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico.add(historico);
	}
	
	public abstract void tranferir(ContaBancario conta , double valor) throws SaldoInsException; 
	
	public abstract void depositar(double valor);
		

}
