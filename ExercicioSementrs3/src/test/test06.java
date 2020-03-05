package test;

import Interface.Buscas;
import model.Aluno;

public class test06 {

	public static void main(String[] args) {
		Aluno al = new Aluno();
		al.setId_Aluno(1);
		al.setDataValidadeCarteira("2020-01-02");
		
		Buscas bu = new Buscas();
		
		bu.AtualizarCarteira(al);
		
		System.out.println("Rodou!!!");
	}

}
