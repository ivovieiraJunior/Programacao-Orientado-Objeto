package Testes;

import java.util.ArrayList;
import java.util.List;

import controles.DaoMercado;
import controles.DaoProduto;
import model.Mercado;
import model.Produto;

public class MainTest01 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Arroz test" ,2.30 , 1);
		Produto p2 = new Produto("Arroz Preto" ,4.30, 1 );
		Produto p3 = new Produto("Arroz Branco" ,3.30 ,1);
		Produto p4 = new Produto("Arroz Pardo" ,6.30, 1);
		
		DaoProduto daoPt = new DaoProduto ();
		
		//daoPt.addProduto(p4); Rodando Perfeitamente
		
		//daoPt.BuscaProduto("Arroz");
		
		List<Produto> produto = new ArrayList<Produto>();
		produto = daoPt.BuscaProduto("Arroz");
		System.out.println("lista dos produtos");
		
		produto.stream().forEach(g-> System.out.println(g.getNome()));
		
		
		Mercado m1 = new Mercado("Mercado Test 1");
		Mercado m2 = new Mercado("Mercado Test 2");
		Mercado m3 = new Mercado("Mercado Test 3");
		Mercado m4 = new Mercado("Mercado Test 4");
		
		DaoMercado daoMd = new DaoMercado ();
		
		//daoMd.addMercado(m4); Rodando Perfeitamente
 
	}

}
