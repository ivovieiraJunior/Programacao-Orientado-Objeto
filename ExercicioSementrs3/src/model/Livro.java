package model;

public class Livro {
	private int id_livro;
	private String titulo;
	private String autor;
	private String editora;
	private int anoLancamento;
	private String categoria;
	private int disponivel;
	
	public Livro(String titulo2, String editora2, String autor2, String categoria2, int ano) {
		this.titulo = titulo2;
		this.editora = editora2;
		this.autor = autor2;
		this.categoria = categoria2;
		this.anoLancamento = ano;
		this.disponivel = 1;
	}
	public Livro() {
		
	}
	public int getId_livro() {
		return id_livro;
	}
	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(int disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
 