package controles;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Mercado;
import utils.JdbcUtil;

public class DaoMercado {
	private PreparedStatement ps;
	
	
	public void addMercado(Mercado mercado) {
		
		String sql = "INSERT INTO Mercado( nome ) "
				+ "values( ? ); ";
		
		try {
			ps = JdbcUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, mercado.getNome()); 
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	}
}
