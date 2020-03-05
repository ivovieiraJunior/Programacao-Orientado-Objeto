package Supermercado;

import java.util.ArrayList;

public class Produto {
	
	private String nome;
	private double preco;
	public ArrayList <Produto> Produto;
	public int quantidade;
	public int getPreco;
	
	
	public Produto () {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

	public ArrayList<Produto> getProduto() {
		return Produto;
	}


	public void setProduto(ArrayList<Produto> produto) {
		Produto = produto;
	}
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

}
