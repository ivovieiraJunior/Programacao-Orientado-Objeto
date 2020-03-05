package Repositorio;

import java.util.List;

import Model.Aeronave;

public interface IAeronaveRepositorio {
	
	
	void cadastrarAeronave(Aeronave aeronave);
	
	void alterarAeronave(Aeronave aeronave);
	
	void deletarAeronave(Aeronave aeronave);

	Aeronave listarPorId(int aeronave);
	
	List<Aeronave> ListarTodasAeronave();
	
	List<Aeronave> ListarEmpresaPorNome(String nome);

}
