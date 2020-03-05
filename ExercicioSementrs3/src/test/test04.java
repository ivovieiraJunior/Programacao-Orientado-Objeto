package test;

import java.util.ArrayList;
import java.util.List;

import Interface.Buscas;

public class test04 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		Buscas bu = new Buscas();
		
		lista = bu.ConsultarEmprestimos("Algoritmos");
		
		lista.stream()
			.forEach(p -> System.out.println(p));
	}

}
