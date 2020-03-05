package Repositorio;

import java.util.List;

import Model.Passageiro;

public interface IPassageiroRepositorio {
	
	void cadastrarPassageiro(Passageiro passageiro);
	
	void alterarPassageiro(Passageiro passageiro);
	
	void deletarPassageiro(Passageiro passageiro);

	Passageiro listarPorId(int passageiro);
	
	List<Passageiro> ListarTodosPassageiros();
	
	List<Passageiro> ListarPassgeiroPorNome(String nome);
	
	
 }
