package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnetion(){
		Connection connection = null;
		String driverJDBC = "org.hsqldb.jdbcDriver";		
		String urlConexao = "jdbc:hsqldb:hsql://localhost";
			                    
		String usuarioConexaoBanco  = "sa";
		String passwordConexaoBanco  = "";
			
		try {
			Class.forName(driverJDBC);
			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection(urlConexao, usuarioConexaoBanco, passwordConexaoBanco);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		
		//System.out.println("conexão estabelecida com sucesso!");
		return connection;
	}
		
	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
