package Testes;

import java.util.ArrayList;
import java.util.List;

import Model.Aeroporto;
import Model.Passageiro;
import Model.Voo;
import Repositorio.AeroportoMySLQRepositorio;
import Repositorio.FunçoesBuscas;
import Repositorio.VooMySQLRepositorio;

public class ExerciciosSelect {

	public static void main(String[] args) {
		
		FunçoesBuscas banco = new  FunçoesBuscas();
		AeroportoMySLQRepositorio banco2 = new  AeroportoMySLQRepositorio();
		Passageiro p1= new Passageiro();
		VooMySQLRepositorio banco3= new VooMySQLRepositorio();
		List<Passageiro> lista = new ArrayList<Passageiro>();
		List<Aeroporto> lista2 = new ArrayList<Aeroporto>();
		List<Voo> lista3 = new ArrayList<Voo>();

	
		//Ex: 1 ) 
			//lista = banco.consultar("j");
		
		//	2)
		
			//lista = banco.ConsultarUltimoNome("m");
		
		//  3)
		
			//int total = banco.consultarQuantoPassageiro();
			
		//	4)
			
			//lista2 = banco2.MostarTodosPorEstado("rs");
			//lista2.stream().forEach(p -> System.out.println(p.getNomeAeroporto()));
			
		//	5)
		
			lista2 = banco2.ListarPorCidade("porto-Alegre");
			
			lista2.stream().forEach(p -> System.out.println(p.getNomeAeroporto()));
			
		//	6)
			
			lista3 = banco3.ListarPelaDataChegada("2019-03-12");
			
			lista3.stream().forEach(a -> System.out.println(a.getNumeroVoo()));
			
			
			//System.out.println("Quanto tem no BD: " + total);
			
		

	}

}
