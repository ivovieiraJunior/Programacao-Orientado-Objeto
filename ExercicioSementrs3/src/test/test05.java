package test;

import java.util.ArrayList;
import java.util.List;

import Interface.Buscas;

public class test05 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		Buscas bu = new Buscas();
		
		lista = bu.ConsultarMultas();
		
		lista.stream()
			.forEach(p -> System.out.println(p));
	}

}
