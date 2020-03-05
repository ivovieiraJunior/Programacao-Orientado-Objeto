import java.util.Scanner;

public class Main {

	private static int opcao;

	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	ContaBancaria cb = new ContaBancaria("ivo", 1);
	int valor = 1000;
	do {
	System.out.println("\nDigite um uma opcao(1.sacar,2.depositar,ou 3.sair,4.mostar): ");
	int opcao = teclado.nextInt();
		switch(opcao) {
	
			case 1:
				System.out.println("Digite o valor a sacar: \n");
				valor = teclado.nextInt();
			try {
				cb.sacar(valor);
			} catch (SaqueExcecao e) {
				e.printStackTrace();
			}
				break;
			
			case 2:
				System.out.println("Digite o valor a depositar: \n");
				valor = teclado.nextInt();
				cb.depositar(valor);
				break;
				
			case 4:
				System.out.println(cb);
				break;
				
			case 3:
				System.out.println("Bye..");
				break;
		}
		teclado.nextLine();
	}while(opcao == 3);
	}

}
