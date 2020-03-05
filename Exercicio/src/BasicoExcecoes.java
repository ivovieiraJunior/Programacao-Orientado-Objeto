
public class BasicoExcecoes {
	
	public static void main(String[] args) {
	
	System.out.println("Comecei bem ...");
		
	// bloco para lidar com execeçoes em java
	try { // tenta..
		int resultado = 27 / 0;
		System.out.println("O resultado foi: " + resultado);
	}catch ( ArithmeticException e) { // caso não consiga... executa isto!, ou catch (Exception e )
		System.out.println("Voçe não pode dividir por zero");
		//e.printStackTrace();
	}
		
		System.out.println("Termonei melhor ainda...");
	}

}
