package Model;

public class Itinerario {
	
	private int numeroReserva;
	private Passageiro passageiro;
	private Voo voo;
	private int numeroAssento;
	private int qtdBagagem;
	private StatusReserva statusReserva;
	
	
	public int getNumeroReserva() {
		return numeroReserva;
	}
	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public int getNumeroAssento() {
		return numeroAssento;
	}
	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	public int getQtdBagagem() {
		return qtdBagagem;
	}
	public void setQtdBagagem(int qtdBagagem) {
		this.qtdBagagem = qtdBagagem;
	}
	
	public StatusReserva getStatusReserva() {
		return statusReserva;
	}

	public void setStatusReserva(StatusReserva statusReserva) {
		this.statusReserva = statusReserva;
	}
	
	
}
