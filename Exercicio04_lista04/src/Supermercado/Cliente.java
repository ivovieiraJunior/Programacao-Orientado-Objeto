package Supermercado;

import java.sql.Array;
import java.util.ArrayList;

public class Cliente<op> {
	
	private String nome;
	private ArrayList < Produto > Produto;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNome(Produto op) {
		ArrayList <op> list = new ArrayList<op>();
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", Produto=" + Produto + "]";
	}

	public void setProduto(Supermercado.Produto p1) {
		// TODO Auto-generated method stub
		
	}


	
}
