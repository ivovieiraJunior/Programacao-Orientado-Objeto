package exercicio02;

public class Teste02 {
	
	Pessoa f1 = new Pessoa("Roger");
	Pessoa mae = new Pessoa("Maria");
	Pessoa pai = new Pessoa("Sergio");
	Pessoa maeMae = new Pessoa("Rosa");
	Pessoa maePai = new Pessoa("Ledio");
	Pessoa PaiMae = new Pessoa("Leticia");
	Pessoa paiPai = new Pessoa("Sergão");
	
	//f1.setPai(pai);
	
	
	
	
	public static void ArvoreFamilia(Pessoa p1) {
		System.out.println(p1);
		if(p1.getPai() != null) {
			ArvoreFamilia(p1.getPai());
		}
		if(p1.getMae() != null) {
			ArvoreFamilia(p1.getMae());
		}
	}

}
