package Repositorio;

import java.util.List;

import Model.Aeroporto;


public interface IAeroportoRepositorio {
	
	void cadastrarAeroporto(Aeroporto aeroporto);
	
	void alterarAeroporto(Aeroporto passageiro);
	
	void deletarAeroporto(Aeroporto passageiro);

	Aeroporto listarPorId(int passageiro);
	
	List<Aeroporto> ListarTodosAeroportos();
	
	List<Aeroporto> ListarAeroportoPorNome(String nome);
}
