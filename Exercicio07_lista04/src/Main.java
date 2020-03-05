import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Contato> contatos1 = new ArrayList<Contato>();
		ArrayList<String> registro = new ArrayList<String>();
		
		Agenda ag = new Agenda("Minha Agenda");
		Pessoal co = new Pessoal();
		Proficional pr = new Proficional();
		int opção = 0;
		int contato = 0;
	
	try {

		Scanner linha = new Scanner(new File("Agenda.txt"));
		
		while(linha.hasNext()) {
			
			String line = linha.nextLine();
			if(line.contains("##Numero")) {
				ag.setTelefone(linha.nextLine());
			}
			else if(line.contains("##Pessoal")) {
				co.setContato(TipoContato.PESSOAL);
				co.setNome(linha.nextLine());
				co.setEmail(linha.nextLine());
				co.setTelefone(linha.nextLine());
				//co.setCpf(linha.nextLine());
				co.setTipoTelefone(TipoTelefone.PARTICULAR);
				
				contatos1.add(co);
				ag.setAgenda(co);
			}
			else if(line.contains("##Proficional")) {
				pr.setContato(TipoContato.PROFICIONAL);
				pr.setNome(linha.nextLine());
				pr.setEmail(linha.nextLine());
				pr.setTelefone(linha.nextLine());
				pr.setTipoTelefone(TipoTelefone.PROFICIONAL);
				
				contatos1.add(pr);
				ag.setAgenda(pr);
			}
			else if(line.contains("##Registro")) {
				ag.setRegistro(linha.nextLine());
			}
		}
		
	linha.close();
	
	
		} catch (FileNotFoundException e) {
				//e.printStackTrace();
		}

	
    
	while(opção != 3){
		
		System.out.println("======== Menu ========" + 
				"\n1 Adicionar Contato"
				+ "\n2 Ligar para Contato" 
				+ "\n3 Sair");
			opção = teclado.nextInt();
			
		switch (opção){
			case 1:
				System.out.println("\nDigite tipo de contato:" + "\n1 Pessoal" + "\n2 Proficional");
				contato = teclado.nextInt();
				if(contato == 1) {
					Pessoal pe = new Pessoal(); 
					System.out.println("\nDigite nome:");
					pe.setNome(teclado.next());
					System.out.println("\nDigite E-mail:");
					pe.setEmail(teclado.next());
					System.out.println("\nDigite Telefone:");
					pe.setTelefone(teclado.next());
					//System.out.println("\nDigite Cpf:");
					//pe.setCpf(teclado.next());
					pe.setContato(TipoContato.PESSOAL);
					pe.setTipoTelefone(TipoTelefone.PARTICULAR);
					
					contatos1.add(pe);
					
					ag.setAgenda(pe);
				}else {
					Proficional pe = new Proficional(); 
					System.out.println("\nDigite nome:");
					pe.setNome(teclado.next());
					System.out.println("\nDigite E-mail:");
					pe.setEmail(teclado.next());
					System.out.println("\nDigite Telefone:");
					pe.setTelefone(teclado.next());
					System.out.println("\nDigite Nome da Empresa:");
					pe.setTelefone(teclado.next());
					pe.setContato(TipoContato.PROFICIONAL);
					pe.setTipoTelefone(TipoTelefone.PROFICIONAL);
					
					contatos1.add(pe);
					ag.setAgenda(pe);
				}
				
				break;
		
			case 2:
				int i = 1;
				for(Contato c: contatos1) {
					
					System.out.println("\n" + i + " Nome:" + c.getNome() + " Telefone:" + c.getTelefone());
					i++;
				}
				System.out.println("\nContato de Numero? ");
				int numero = teclado.nextInt();
				String telefone = null ;
				i = 1;
				for(Contato c: contatos1) {
					if(i == numero) {
					   telefone = c.getTelefone();
					}
					i++;
				}
				ag.setRegistro( ag.getTelefone() + " ligou para " + telefone);
				
				break;
			
			case 3:
				
			Formatter saida;
			try {
			
				saida = new Formatter("Agenda.txt");
				
						saida.format("##Numero\n%s ", ag.getTelefone());
						
					for(Contato c: contatos1) {
						
						if(c.getTipo().equals(TipoContato.PESSOAL)) {	
							saida.format("\n##Pessoal\n%s\n%s\n%s",		
								c.getNome(),
								c.getEmail(),
								c.getTelefone());
							//	c.getCpf());
						}
						else if(c.getTipo().equals(TipoContato.PROFICIONAL)) {
							
							saida.format("\n##Proficional\n%s\n%s\n%s",
								c.getNome(),
								c.getEmail(),
								c.getTelefone());
								//c.getNomeEmpresa());

						}
						
						
					}
					saida.format("\n##Registro\n%s", 
						ag.getRegistro());
					saida.close();
				} catch (FileNotFoundException e) {
					System.out.println(e.getMessage());
					}
				break;
		}
	}//while	
	}

}