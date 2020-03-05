package model;

public class Emprestimo {
	
	private int id;
	private int id_Aluno;
	private int id_Livro;
	private String dataRetirada;
	private String dataDevolicao;
	private String dataPrevistaDevolicao;
	private double multa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_Aluno() {
		return id_Aluno;
	}
	public void setId_Aluno(int id_Aluno) {
		this.id_Aluno = id_Aluno;
	}
	public int getId_Livro() {
		return id_Livro;
	}
	public void setId_Livro(int id_Livro) {
		this.id_Livro = id_Livro;
	}
	public String getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public String getDataDevolicao() {
		return dataDevolicao;
	}
	public void setDataDevolicao(String dataDevolicao) {
		this.dataDevolicao = dataDevolicao;
	}
	public String getDataPrevistaDevolicao() {
		return dataPrevistaDevolicao;
	}
	public void setDataPrevistaDevolicao(String dataPrevistaDevolicao) {
		this.dataPrevistaDevolicao = dataPrevistaDevolicao;
	}
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	
}
