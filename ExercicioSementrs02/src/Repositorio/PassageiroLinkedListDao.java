package Repositorio;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import Model.Passageiro;

public class PassageiroLinkedListDao implements IPassageiroRepositorio {
	
	private LinkedList<Passageiro> Lista; 
	
	public PassageiroLinkedListDao (){
		Lista = new LinkedList<Passageiro>();
	}
	
	@Override
	public void cadastrarPassageiro(Passageiro passageiro) {
		Lista.add(passageiro);
	}

	@Override
	public void alterarPassageiro(Passageiro passageiro) {
		int index = buscarIndex(passageiro);
		Lista.set(index, passageiro);
	}
	
	public int buscarIndex(Passageiro pass) {
		for(int tam =0; tam < Lista.size(); tam++) {
			if(Lista.get(tam).equals(pass)) {
				return tam;
			}
		}		
		return -1;
	}

	@Override
	public void deletarPassageiro(Passageiro passageiro) {
		ArrayList<Passageiro> novaLista = new ArrayList<Passageiro>();
		
		for(int tam =0; tam<Lista.size();tam++) {
			if(!Lista.equals(passageiro)){
				novaLista.add(Lista.get(tam));
			}
		}
		Lista.clear();
		Lista.addAll(novaLista);
		novaLista.clear();
		// ou 
		// int index = buscarIndex(passageiro);
		// Lista.remove(index);
	}

	@Override
	public Passageiro listarPorId(int passageiro) {
		for(int tam =0; tam < Lista.size(); tam++) {
			if(Lista.get(tam).getIdPassageiro() == passageiro) {
				return Lista.get(tam);
			}
		}
		return null;
	}

	@Override
	public List<Passageiro> ListarTodosPassageiros() {
		return Lista;
	}

	@Override
	public List<Passageiro> ListarPassgeiroPorNome(String nome) {
		List<Passageiro> listaP = new ArrayList<>();
		for(Passageiro p: Lista) {
			if(p.getPrimeiroNome().equals(nome)) {
				listaP.add(p);
			}
		}
		return listaP;
	}

}
