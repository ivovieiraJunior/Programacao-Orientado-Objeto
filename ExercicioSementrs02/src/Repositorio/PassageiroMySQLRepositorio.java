package Repositorio;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Passageiro;
import util.JdbcDBUtil;

public class PassageiroMySQLRepositorio implements IPassageiroRepositorio {
	
	private PreparedStatement ps;	
	
	@Override
	public void cadastrarPassageiro(Passageiro passageiro) {
		String sql = "INSERT INTO passageiro (primeiroNome, ultimoNome, fone"
				+ ", email,totalMilhas, nacionalidade) VALUES(?,?,?,?,?,?);";

		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, passageiro.getPrimeiroNome());
			ps.setString(2, passageiro.getUltimoNome());
			ps.setString(3, passageiro.getFone());
			ps.setString(4, passageiro.getEmail());
			ps.setInt(5, passageiro.getTotalMilhas());
			ps.setString(6, passageiro.getNacionalidade());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	@Override
	public void alterarPassageiro(Passageiro passageiro) {
		String sql = "UPDATE Passageiro set primeiroNome = ?"
				+ "UltimoNome = ?"
				+ "fone = ?"
				+ "email = ?"
				+ "totalMilhas = ?"
				+ "nacionalidade = ?"
				+ "where idPassageiro = ?";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, passageiro.getPrimeiroNome());
			ps.setString(2, passageiro.getUltimoNome());
			ps.setString(3, passageiro.getFone());
			ps.setString(4, passageiro.getEmail());
			ps.setInt(5, passageiro.getTotalMilhas());
			ps.setString(6, passageiro.getNacionalidade());
			ps.setInt(7, passageiro.getIdPassageiro());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deletarPassageiro(Passageiro passageiro) {
		String sql = "DELETE FROM Passageiro where idPassageiro = ?";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, passageiro.getPrimeiroNome());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Passageiro listarPorId(int passageiro) {
		Passageiro passID = new Passageiro();
		
		String sql = "SELECT * FROM Passageiro "
				+ "Where idPassageiro = ? ;";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setInt(1, passageiro);
			
			ResultSet rs = ps.executeQuery(); 
		
			while(rs.next()) {
				
				passID.setPrimeiroNome(rs.getString("primeiroNome"));
				passID.setUltimoNome(rs.getString("ultimoNome"));
				passID.setFone(rs.getString("fone"));
				passID.setTotalMilhas(rs.getInt("totalMilhas"));
				passID.setNacionalidade(rs.getString("nacionalidade"));
				passID.setIdPassageiro(rs.getInt("idPassageiro"));
				passID.setEmail(rs.getString("email"));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return passID;
	}

	@Override
	public List<Passageiro> ListarTodosPassageiros() {
		List<Passageiro> lista = new ArrayList<Passageiro>();
		
		String sql = "SELECT * FROM Passageiro";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(); 
			
			while(rs.next()) {
				Passageiro p = new Passageiro();
				
				p.setPrimeiroNome(rs.getString("primeiroNome"));
				p.setUltimoNome(rs.getString("ultimoNome"));
				p.setFone(rs.getString("fone"));
				p.setTotalMilhas(rs.getInt("totalMilhas"));
				p.setNacionalidade(rs.getString("nacionalidade"));
				p.setIdPassageiro(rs.getInt("idPassageiro"));
				p.setEmail(rs.getString("email"));
				
				lista.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public List<Passageiro> ListarPassgeiroPorNome(String nome) {
		List<Passageiro> listaNome = new ArrayList<Passageiro>();
		
		String sql = "SELECT * FROM Passageiro"
				+ " where primeiroNome = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, nome);
			
			ResultSet rs = ps.executeQuery(); 
			
			while(rs.next()) {
				Passageiro p = new Passageiro();
				
				p.setPrimeiroNome(rs.getString("primeiroNome"));
				p.setUltimoNome(rs.getString("ultimoNome"));
				p.setFone(rs.getString("fone"));
				p.setTotalMilhas(rs.getInt("totalMilhas"));
				p.setNacionalidade(rs.getString("nacionalidade"));
				p.setIdPassageiro(rs.getInt("idPassageiro"));
				p.setEmail(rs.getString("email"));
				
				listaNome.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaNome;

	}

}
