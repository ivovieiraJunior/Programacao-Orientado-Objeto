package test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

import Interface.Buscas;
import model.Aluno;
import model.Livro;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Buscas func = new Buscas();

		int opção = 0;
		while(opção != 10){
			
			System.out.println("========== Menu ==========" + 
					"\n1 Adicionar Aluno"
					+ "\n2 Adicionar Livro"
					+ "\n3 Consultar livro(s) (Pelo titulo)"
					+ "\n4 Consultar livros (Pela Categoria)"
					+ "\n5 Consultar Emprestimos"
					+ "\n6 Consultar Multar por Aluno"
					+ "\n7 Atualizar CarteiraEstudante"
					+ "\n8 Emprestar"
					+ "\n9 Devolver"
					+ "\n10 Sair");
				opção = teclado.nextInt();
				
			switch (opção){
				case 1:
					System.out.println("========== Cadastro Aluno =========="
							+ "\n Nome:");
					String nome = teclado.next();
					System.out.println("\n Email");
					String email = teclado.next();
					System.out.println("\n Fone:");
					String fone = teclado.next();
					System.out.println("\n Data da carterira");
					String dataCarteira = teclado.next();
					
					Aluno aluno = new Aluno(nome,email,fone,dataCarteira);
					
					func.CadastarAluno(aluno);
					System.out.println("Cadastrado Com Sucesso Aluno");
					break;
			
				case 2:
					System.out.println("\n========== Cadastro Livro =========="
							+ "\n Titulo:");
					teclado = new Scanner(System.in);
					String titulo = teclado.nextLine();
					System.out.println("\n Editora:");
					String editora = teclado.next();
					System.out.println("\n Autor:");
					String autor = teclado.next();
					System.out.println("\n Categoria:");
					String categoria = teclado.next();
					System.out.println("Ano do lançamento (ex 2000)");	
					int ano = teclado.nextInt();
					
					Livro livro = new Livro(titulo,editora,autor,categoria,ano);
					func.CadastarLivro(livro);
					
					break;
				case 3:
					System.out.println("========== Consultar Livro (Titulo) =========="
							+ "\n Titulo:");
					titulo =  teclado.next();
					List<Livro> lista = new ArrayList<Livro>();
					 lista = func.ConsultarLivroTitulo(titulo);
					
					 lista.stream()
					 	.forEach(p -> System.out.println("\n" + p) );
					break;
				case 4:
					System.out.println("========== Consultar Livro (Categoria) =========="
							+ "\n Categoria:");
					titulo =  teclado.next();
					List<Livro> lista1 = new ArrayList<Livro>();
					 lista1 = func.ConsultarLivroTitulo(titulo);
					
					 lista1.stream()
					 	.forEach(p -> System.out.println("\n" + p) );
					break;
				case 10:
					break;
			}
		}//while	

	}

}
