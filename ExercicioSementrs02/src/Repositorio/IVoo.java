package Repositorio;

import java.util.List;

import Model.Voo;

public interface IVoo {
	
void cadastrarVoo(Voo voo);
	
	void alterarVoo(Voo voo);
	
	void deletarVoo(Voo voo);

	Voo listarPorId(int voo);
	
	List<Voo> ListarTodosVoos();
	
}
