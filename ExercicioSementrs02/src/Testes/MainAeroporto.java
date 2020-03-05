package Testes;

import java.util.ArrayList;
import java.util.List;

import Model.Aeronave;
import Repositorio.AeronaveMySQLRepositorio;

public class MainAeroporto {

	public static void main(String[] args) {

		AeronaveMySQLRepositorio banco = new AeronaveMySQLRepositorio();
		
		Aeronave a = new Aeronave();
		a.setNomeEmpresa("tam");
		a.setIdAeroporto(4);
		a.setNumeroDeAssentos(26);
		a.setTipoAeronave("monoMotor");
		
		//banco.cadastrarAeronave(a);
		List<Aeronave> empre = new ArrayList<Aeronave>();
		empre = banco.ListarEmpresaPorNome("tam");
	
		
	}

}
