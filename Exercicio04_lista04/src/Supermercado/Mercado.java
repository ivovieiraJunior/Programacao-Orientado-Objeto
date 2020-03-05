package Supermercado;

public class Mercado {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		p1.setNome("arroz");
		p1.setPreco(2);
		p1.setQuantidade(10);
		
		p2.setNome("Feijao");
		p2.setPreco(4);
		p2.setQuantidade(3);
		
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente.setNome("Ivo");
		cliente2.setNome("Ferpa");
		
		cliente.setProduto(p1);
		cliente2.setProduto(p2);
		
		
		System.out.println("cliente: " + cliente.getNome() + " valor: " + p1.getPreco()* p1.getQuantidade() 
					+ " Forma a Pagar: " + Pagamento.DINHEIRO.name());
		
		System.out.println("cliente: " + cliente2.getNome() + " valor: " + p2.getPreco()* p2.getQuantidade() 
				+ " Forma a Pagar: " + Pagamento.DINHEIRO.name());
		
		cliente.setProduto(p2);
		
		System.out.println("cliente: " + cliente.getNome() + " valor: " + (p1.getPreco()* p1.getQuantidade() + p2.getPreco()* p2.getQuantidade()) 
				+ " Forma a Pagar: " + Pagamento.CARTAO.name());
	}

}
