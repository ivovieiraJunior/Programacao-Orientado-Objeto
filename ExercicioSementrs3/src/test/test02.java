package test;

import java.util.ArrayList;
import java.util.List;

import Interface.Buscas;
import model.Livro;

public class test02 {

	public static void main(String[] args) {
		List<Livro> lista = new ArrayList<Livro>();
		
		Buscas bu = new Buscas();
		
		lista = bu.ConsultarLivroTitulo("Algoritmos");
		
		lista.stream()
			.forEach(p -> System.out.println(p.getTitulo()));
	}

}
