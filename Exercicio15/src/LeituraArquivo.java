import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraArquivo {
	public static void main(String[] args) {
		
		List<Pessoa> listaCliente = new ArrayList();
		List<Funcionario> listaFunc = new ArrayList();
	
		try {
			Scanner arquivo = new Scanner(new File("dados.txt"));
			
			String line = arquivo.nextLine();
			if(line.contains("##Cliente")) {
				
				Cliente cli = new Cliente();
				cli.setNome(arquivo.nextLine());
				cli.setCpf(arquivo.nextLine());
				cli.setTelefone(arquivo.nextLine());
				listaCliente.add(cli);
			}
			
			else if(line.contains("##Funcionario")) {
				
				Funcionario func = new Funcionario();
				func.setNome(arquivo.nextLine());
				func.setCpf(arquivo.nextLine());
				func.setTelefone(arquivo.nextLine());
				func.setSalario(arquivo.nextFloat());
				func.setMatricula(arquivo.nextLine());
				listaFunc.add(func);
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
		
		System.out.println("Clientes: \n" + listaCliente.toString());
		System.out.println("Funcionario: \n" + listaFunc.toString());
		
	}

}
