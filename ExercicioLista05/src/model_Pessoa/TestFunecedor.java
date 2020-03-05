package model_Pessoa;

public class TestFunecedor {

	public static void main(String[] args) {
		
		Fornecedor forne = new Fornecedor();
		forne.setNome("AleBebidas");
		forne.setEndereço("Rua zero");
		forne.setTelefone("51 9 12345678");
		
	 	printf(forne.toString());
	 	
	}
	/**
	 * 
	 * @param String info
	 */
	public static void printf(String info) {
		System.out.println(info);
		return;
	}

}
