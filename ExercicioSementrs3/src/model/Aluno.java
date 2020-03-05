package model;

public class Aluno {
	private int id_Aluno;
	private String nome;
	private String email;
	private String fone;
	private String dataValidadeCarteira;
	
	public  Aluno(String nome, String email, String fone, String data){
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.dataValidadeCarteira = data;
	}
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public int getId_Aluno() {
		return id_Aluno;
	}
	public void setId_Aluno(int id_Aluno) {
		this.id_Aluno = id_Aluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getDataValidadeCarteira() {
		return dataValidadeCarteira;
	}
	public void setDataValidadeCarteira(String dataValidadeCarteira) {
		this.dataValidadeCarteira = dataValidadeCarteira;
	}
	
	
}
