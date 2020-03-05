
public class Teste02 {
	
	public static void main (String[] args) {
	
	
	Pessoa f1 = new Pessoa("Roger");
	Pessoa mae = new Pessoa("Maria");
	Pessoa pai = new Pessoa("Sergio");
	Pessoa maeMae = new Pessoa("Rosa");
	Pessoa maePai = new Pessoa("Ledio");
	Pessoa PaiMae = new Pessoa("Leticia");
	Pessoa paiPai = new Pessoa("Sergão");
	
	f1.setMae(mae);
	f1.setPai(pai);
	mae.setMae(maeMae);
	mae.setPai(maePai);
	pai.setMae(PaiMae);
	pai.setPai(paiPai);
	
	
	arvoreFamilia(f1);
	}
	
	public static void arvoreFamilia(Pessoa p1) {
		
		
		System.out.println(p1.getNome());

		if(p1.getPai() != null) {
			arvoreFamilia(p1.getPai());
		}
		
		if(p1.getMae() != null) {
			
			arvoreFamilia(p1.getMae());
		}
	}
	
}
