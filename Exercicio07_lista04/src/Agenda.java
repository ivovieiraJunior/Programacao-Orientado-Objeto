import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private  String agenda;
	private  String telefone;
	private  ArrayList <Contato> Agenda ;
	private  ArrayList <String> registro ; 

	
	public Agenda(String nome) {
		this.agenda = nome;
		Agenda = new ArrayList<Contato>();
		registro = new ArrayList<String>();
	}

	public ArrayList <Contato> getAgenda() {
		return Agenda;
	}

	public void setAgenda(Contato f) {
		Agenda.add(f);
		
	}

	public List <String> getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro.add(registro);
	}
	
	@Override
	public String toString() {
		return Agenda.toString();
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
