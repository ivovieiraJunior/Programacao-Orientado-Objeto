package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Model.Passageiro;

public class PassageiroArryListRepositorio implements IPassageiroRepositorio{

	private List<Passageiro> lista;
	
	public PassageiroArryListRepositorio() {
		lista = new ArrayList<>();
	}
	@Override
	public void cadastrarPassageiro(Passageiro passageiro) {
		lista.add(passageiro);
	}

	@Override
	public void alterarPassageiro(Passageiro passageiro) {
		int resultado = ListarPassageiro(passageiro.getIdPassageiro());
		lista.set(resultado, passageiro);
	}

	@Override
	public void deletarPassageiro(Passageiro passageiro) {
		int resultado = ListarPassageiro(passageiro.getIdPassageiro());
		lista.remove(resultado);
	}

	@Override
	public Passageiro listarPorId(int passageiro) {
		Passageiro resultado = null;
		for(Passageiro p:lista) {
			if(p.getIdPassageiro() == passageiro) {
				resultado = p;
				break;
			}	
		} 
		return resultado;
	}
	
	public int ListarPassageiro(int passageiro) {
		int resultado = 0;
		for(Passageiro p:lista) {
			if(p.getIdPassageiro() == passageiro) {
				resultado = passageiro;
				break;
			}
		}		
		return resultado;
	}

	@Override
	public List<Passageiro> ListarTodosPassageiros() {
		return lista;
	}

	@Override
	public List<Passageiro> ListarPassgeiroPorNome(String nome) {
		List<Passageiro> listaP = new ArrayList<>();
		for(Passageiro p: lista) {
			if(p.getPrimeiroNome().equals(nome)) {
				listaP.add(p);
			}
		}
		return listaP;
	}

}
