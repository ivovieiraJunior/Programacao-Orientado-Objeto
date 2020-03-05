package Testes;

import java.util.HashSet;
import java.util.TreeSet;

public class TestePassageiro {

	public static void main(String[] args) {
		HashSet<String> cargos = new HashSet<String>();
		
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionario");
		cargos.add("Diretor");//repetido
		cargos.add(null);
		
		System.out.println(cargos);
		
		TreeSet<String> carg = new TreeSet<String>();
		
		carg.add("Gerente");
		carg.add("Diretor");
		carg.add("Presidente");
		carg.add("Secretária");
		carg.add("Funcionario");
		carg.add("Diretor");//repetido
		//carg.add(null);
		
		System.out.println(carg);
	}

}
