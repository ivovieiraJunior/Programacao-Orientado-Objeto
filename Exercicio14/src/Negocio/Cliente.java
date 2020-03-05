package Negocio;

public class Cliente extends Pessoa {
	
	private String Bandeiracc;
	private String numeroCC;
	
	public Cliente(String bandCC, String numeroCC) {
		this.Bandeiracc = bandCC;
		this.numeroCC = numeroCC;
	}
	
	public String getBandeiracc() {
		return Bandeiracc;
	}
	public void setBandeiracc(String bandeiracc) {
		Bandeiracc = bandeiracc;
	}
	public String getNumeroCC() {
		return numeroCC;
	}
	public void setNumeroCC(String numeroCC) {
		this.numeroCC = numeroCC;
	}

}
