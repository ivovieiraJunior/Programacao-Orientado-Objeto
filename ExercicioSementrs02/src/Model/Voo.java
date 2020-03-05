package Model;

import java.util.Date;

public class Voo {
	
	private int numeroVoo;
	private Date dataSaida;
	private Date dataChegada;
	private String aeronave;
	private int idAeroportoOrigem;
	private int idAeroportoChegada;
	
	
	public int getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public String getAeronave() {
		return aeronave;
	}
	public void setAeronave(String aeronave) {
		this.aeronave = aeronave;
	}
	public int getIdAeroportoOrigem() {
		return idAeroportoOrigem;
	}
	public void setIdAeroportoOrigem(int idAeroportoOrigem) {
		this.idAeroportoOrigem = idAeroportoOrigem;
	}
	public int getIdAeroportoChegada() {
		return idAeroportoChegada;
	}
	public void setIdAeroportoChegada(int idAeroportoChegada) {
		this.idAeroportoChegada = idAeroportoChegada;
	}
	
}
