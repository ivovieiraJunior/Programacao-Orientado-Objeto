package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Produto {
	
	private SimpleStringProperty nome;
	private SimpleDoubleProperty preco;
	private SimpleIntegerProperty Mercado;
	
	
	
	public Produto(String nome, double preco , int idmercado) {
		this.nome = new SimpleStringProperty(nome);
		this.preco = new SimpleDoubleProperty(preco);
		this.Mercado = new SimpleIntegerProperty(idmercado);
	}


	public Produto() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome.get();
	}


	public void setNome(String nome) {
		this.nome.set(nome);
	}


	public float getPreco() {
		return (float) preco.get();
	}


	public void setPreco(double preco) {
		this.preco.set(preco);
	}


	public Integer getMercado() {
		return Mercado.get();
	}


	public void setMercado(int mercado) {
		this.Mercado.set(mercado);
	}
	
}
