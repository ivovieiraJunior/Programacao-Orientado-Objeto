package test;

import java.util.ArrayList;
import java.util.List;

import Interface.Buscas;

public class Teste03 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		Buscas busca = new Buscas();
		
		lista = busca.ConsultarLivroQuantidade();
		
		lista.stream()
			.forEach(p -> System.out.println(p));
		
	}

}
