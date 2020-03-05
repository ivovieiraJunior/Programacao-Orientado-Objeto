package Testes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Model.Passageiro;
import Repositorio.PassageiroArryListRepositorio;
import Repositorio.PassageiroMapRepositorio;
import Repositorio.PassageiroMySQLRepositorio;

public class MainPassageiro {

	public static void main(String[] args) {
		
		PassageiroArryListRepositorio daoArryList = new PassageiroArryListRepositorio();

		Passageiro p1 = new Passageiro();
		p1.setIdPassageiro(1);
		p1.setPrimeiroNome("Luis");
		
		Passageiro p2 = new Passageiro();
		p2.setIdPassageiro(2);
		p2.setPrimeiroNome("jarlos");
		
		Passageiro p3 = new Passageiro();
		p3.setIdPassageiro(3);
		p2.setPrimeiroNome("carlos");
		p2.setUltimoNome("silva");
		p2.setFone("051233320000");
		p2.setEmail("carlos.@hotmail.com");
		p2.setNacionalidade("brasil");
		
		p2.addMilhas(100);
		p2.addMilhas(200);
		p2.addMilhas(500);
		//p3.setNacionalidade("Br");
		p2.addMilhas(80);
		//p2.setNacionalidade("Eua");
		p1.setNacionalidade("Br");
		
		ArrayList<Passageiro> list = new ArrayList();

		list.add(p3);
		list.add(p1);
		list.add(p2);

		PassageiroMySQLRepositorio banco = new PassageiroMySQLRepositorio();
//		banco.cadastrarPassageiro(p2);
		
//------------- teste ----------
		
		List<Passageiro> todos = banco.ListarTodosPassageiros(); 
		
		//todos.stream().forEach(p -> System.out.println(p.getPrimeiroNome()));
		p1 = banco.listarPorId(1);
	
		System.out.println(p1);
		
		todos = banco.ListarPassgeiroPorNome("joao");
		
		todos.stream().forEach(p -> System.out.println(p.getPrimeiroNome()));
	
		System.out.println("fim");
		
	}

}
