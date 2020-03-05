package Repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hsqldb.jdbc.JDBCUtil;

import Model.Passageiro;
import util.JdbcDBUtil;

public class FunçoesBuscas {
	
	private PreparedStatement ps;
	
	public List<Passageiro> consultar(String nome) {
		List<Passageiro> Lista = new ArrayList<Passageiro>();
		Passageiro pass = new Passageiro();
		
		String sql = "SELECT * from Passageiro"
				+ " where primeiroNome like ? " ;
		
	
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, nome +'%');
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				pass.setPrimeiroNome(rs.getString("primeiroNome"));
				pass.setUltimoNome(rs.getString("ultimoNome"));
				pass.setIdPassageiro(rs.getInt("idPassageiro"));
				pass.setNacionalidade(rs.getString("nacionalidade"));
				pass.setFone(rs.getString("fone"));
				
				Lista.add(pass);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Lista;
	}
	
	public List<Passageiro> ConsultarUltimoNome(String nome){
		List<Passageiro> lista = new ArrayList<Passageiro>(); 
		Passageiro p = new Passageiro();
		
		String sql = "SELECT * FROM Passageiro"
				+ " where ultimoNome like ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, nome + '%');
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				p.setPrimeiroNome(rs.getString("primeiroNome"));
				p.setUltimoNome(rs.getString("ultimoNome"));
				
				lista.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lista;
	}
	
	public int consultarQuantoPassageiro(){
		
		String sql = "SELECT COUNT(idPassageiro) AS TOTAL from Passageiro ";
		int total = 0;
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				total = rs.getInt("TOTAL");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return total;
	}

}







