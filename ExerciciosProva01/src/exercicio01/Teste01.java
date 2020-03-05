package exercicio01;

public class Teste01 {

	public static void main(String[] args) {
		
		Gabarito gab = new Gabarito();
		Prova p1 = new Prova(gab,"roger");
		
		p1.setReposta('a');
		p1.setReposta('f');
		p1.setReposta('c');
		p1.setReposta('a');
		p1.setReposta('a');
		p1.setReposta('a');
		
		
		System.out.println(p1);
		
		
	}

}
