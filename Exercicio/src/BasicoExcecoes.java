
public class BasicoExcecoes {
	
	public static void main(String[] args) {
	
	System.out.println("Comecei bem ...");
		
	// bloco para lidar com exece�oes em java
	try { // tenta..
		int resultado = 27 / 0;
		System.out.println("O resultado foi: " + resultado);
	}catch ( ArithmeticException e) { // caso n�o consiga... executa isto!, ou catch (Exception e )
		System.out.println("Vo�e n�o pode dividir por zero");
		//e.printStackTrace();
	}
		
		System.out.println("Termonei melhor ainda...");
	}

}
