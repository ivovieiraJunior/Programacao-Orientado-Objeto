import java.io.FileNotFoundException;
import java.util.Formatter;

public class TestMain {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Ivo");
		c1.setCpf("000-222-111-32");
		c1.setTelefone("91926722");
		
		
		Funcionario func = new Funcionario();
		
		func.setNome("roberto");
		func.setCpf("000-000-111-32");
		func.setTelefone("912722");
		func.setSalario(1000);
		func.setMatricula("011");
		try {
			Formatter saida = new Formatter("dados.txt");
			
			saida.format("##Cliente\n %s\n%s\n%s\n",		
						c1.getNome(),
						c1.getCpf(),
						c1.getTelefone());
		
			saida.format("##Funcionario\n %s\n%s\n%s\n%f\n%s\n",
					func.getNome(),
					func.getCpf(),
					func.getTelefone(),
					func.getSalario(),
					func.getMatricula());
			
			
			saida.close();
			
		}catch(FileNotFoundException e) {
			
		}

		
	}

}
