package Model;

public class Aeronave {
	
	private int numeroDeAssentos;
	private int idAeroporto;
	private String nomeEmpresa;
	private String tipoAeronave;
	
	
	public int getIdAeroporto() {
		return idAeroporto;
	}
	public void setIdAeroporto(int idAeroporto) {
		this.idAeroporto = idAeroporto;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getTipoAeronave() {
		return tipoAeronave;
	}
	public void setTipoAeronave(String tipoAeronave) {
		this.tipoAeronave = tipoAeronave;
	}
	
	public int getNumeroDeAssentos() {
		return numeroDeAssentos;
	}
	public void setNumeroDeAssentos(int numeroDeAssentos) {
		this.numeroDeAssentos = numeroDeAssentos;
	}
	
	
}
