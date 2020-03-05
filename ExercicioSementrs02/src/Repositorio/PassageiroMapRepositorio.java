package Repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Passageiro;

public class PassageiroMapRepositorio implements IPassageiroRepositorio {
	HashMap<Integer,Passageiro> list;
	
	public PassageiroMapRepositorio() {
		list = new HashMap<Integer,Passageiro>();
	}
	@Override
	public void cadastrarPassageiro(Passageiro passageiro) {
		list.put(passageiro.getIdPassageiro(), passageiro);
	}

	@Override
	public void alterarPassageiro(Passageiro passageiro) {
		list.replace(passageiro.getIdPassageiro(), passageiro);
	}

	@Override
	public void deletarPassageiro(Passageiro passageiro) {
		list.remove(passageiro.getIdPassageiro());
	}

	@Override
	public Passageiro listarPorId(int passageiro) {
		for(Map.Entry<Integer, Passageiro> p: list.entrySet()) {
			if(p.getKey() == passageiro) {
				return p.getValue();
			}
		}
		return null;
	}

	@Override
	public List<Passageiro> ListarTodosPassageiros() {
		ArrayList<Passageiro> p = new ArrayList<>();
		p.addAll(list.values());
		return p;
	}

	@Override
	public List<Passageiro> ListarPassgeiroPorNome(String nome) {
		ArrayList<Passageiro> todos = new ArrayList<Passageiro>();
		for(Map.Entry<Integer, Passageiro> p: list.entrySet()) {
			if(p.getValue().getPrimeiroNome().equals(nome)) {
				todos.add(p.getValue());
			}
		}
		return todos;
	}

}
