import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LendoArquivo {
	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<Cliente>(); 
		List<Funcionario> Func = new ArrayList<Funcionario>();
		
		try {
			
			
			Scanner linha = new Scanner(new File("dados.txt"));
			
			while(linha.hasNext()) {
				
				String line = linha.nextLine();
				
				if(line.contains("##Cliente")) {
					Cliente cli = new Cliente();
					cli.setNome(linha.nextLine());
					cli.setCpf(linha.nextLine());
					cli.setTelefone(linha.nextLine());
					// depois add no ArryList de tipo cliente
					clientes.add(cli);
				}
				else if(line.contains("##Funcionario")) {
					Funcionario func = new Funcionario();
					func.setNome(linha.nextLine());
					func.setCpf(linha.nextLine());
					func.setTelefone(linha.nextLine());
					func.setSalario(linha.nextDouble());
					func.setMatricula(linha.nextLine());
					// depois add no ArryList de tipo Funcionario 
					Func.add(func);
				}
			}
			
			linha.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Cliente c: clientes) {
			System.out.println(c);
		}
		for(Funcionario f: Func) {
			System.out.println(f);
		}
		
	}
}
