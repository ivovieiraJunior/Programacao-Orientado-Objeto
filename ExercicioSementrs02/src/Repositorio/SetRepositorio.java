package Repositorio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Model.Passageiro;

public class SetRepositorio implements IPassageiroRepositorio {

	private Set<Passageiro> lista;
	
	public SetRepositorio () {
		lista = new HashSet<Passageiro>();
	}
	
	@Override
	public void cadastrarPassageiro(Passageiro passageiro) {
		lista.add(passageiro);
	}

	@Override
	public void alterarPassageiro(Passageiro passageiro) {
		deletarPassageiro(listarPorId(passageiro.getIdPassageiro()));
		lista.add(passageiro);
	}

	@Override
	public void deletarPassageiro(Passageiro passageiro) {
		lista.remove(passageiro);
	}

	@Override
	public Passageiro listarPorId(int passageiro) {
		Passageiro pass = null;
		for(Passageiro p: lista) {
			if(p.getIdPassageiro() == passageiro) {
				pass = p;
				break;
			}
		}
		return pass;
	}

	@Override
	public List<Passageiro> ListarTodosPassageiros() {
		//List list = new ArrayList(this.lista);
		// return list
		return new ArrayList(lista);
	}

	@Override
	public List<Passageiro> ListarPassgeiroPorNome(String nome) {
		ArrayList<Passageiro> novaLista = new ArrayList<Passageiro>();
		for(Passageiro p:lista) {
			if(p.getPrimeiroNome().equals(nome)) {
				novaLista.add(p);
			}
		}
		return novaLista;
	}

}
