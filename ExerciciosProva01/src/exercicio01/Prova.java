package exercicio01;

public class Prova {
	
	private Gabarito gabarito;
	private String nome;
	private char[] reposta;
	private int acertos;
	private int questão;
	
	public Prova() {
		
	}
	
	public Prova(Gabarito gabarito , String nome) {
		this.gabarito = gabarito;
		this.nome = nome;
		this.reposta = new char [6]; 
		this.questão = 0;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char[] getReposta() {
		return reposta;
	}

	public void setReposta(char reposta) {
		this.reposta[questão] = reposta;
		this.questão ++;
	}
	
	public int getNota() {
		int nota = 0;
		for(int i=0; i<6; i++) {
			if(reposta[i] == gabarito.getGabarito()[i]) {
				this.acertos += 1;
				if(i < 2) {
					nota += 1; 
				}else {
					nota += 2;
				 }	
			}
		}
	return nota;	
	}
	
	

	public int getAcertos() {
		return acertos;
	}
	

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Nota:" + this.getNota() + " acertos:" + this.acertos ;
	}
	
	
	

	
}
