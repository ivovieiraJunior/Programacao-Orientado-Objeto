package controles;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Produto;
import utils.JdbcUtil;

public class DaoProduto {
		
		private PreparedStatement ps;
		
	
		public void addProduto(Produto produto) {
			
			String sql = "INSERT INTO produto(Nome , Preco , idmercado) "
					+ "values( ?, ?, ? ); ";
			
			try {
				ps = JdbcUtil.getConnetion().prepareStatement(sql);
				ps.setString(1, produto.getNome());
				ps.setDouble(2, produto.getPreco());
				ps.setInt(3, produto.getMercado());
				ps.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		public ObservableList<Produto> BuscaProduto(String produto) {
				//Caso o usuário coloque vaziu
			if(produto.equals("") || produto.equals(" ")) {
				return null;
			}
			ObservableList<Produto> result = FXCollections.observableArrayList();
			
			String sql = "Select nome, preco , idmercado as mercado from produto where nome like  ? order by preco ";
			try {
				ps = JdbcUtil.getConnetion().prepareStatement(sql);
				ps.setString(1, "%" + produto + "%");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					
					Produto p1 = new Produto(rs.getString("nome"), rs.getDouble("preco") , rs.getInt("mercado"));
					result.add(p1);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return result;
		}
	

}
