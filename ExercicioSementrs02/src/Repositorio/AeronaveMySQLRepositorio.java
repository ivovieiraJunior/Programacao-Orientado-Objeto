package Repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Aeronave;
import Model.Passageiro;
import util.JdbcDBUtil;

public class AeronaveMySQLRepositorio implements IAeronaveRepositorio {
	
	private PreparedStatement ps;
	
	@Override
	public void cadastrarAeronave(Aeronave aeronave) {
		String sql = "INSERT INTO aeronave (idAeroporto,nomeEmpresa, tipoAeronave,numeroDeAssentos)"
				+ "VALUES(?,?,?,?);";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setInt(1, aeronave.getIdAeroporto());
			ps.setString(2, aeronave.getNomeEmpresa());
			ps.setString(3, aeronave.getTipoAeronave());
			ps.setInt(4, aeronave.getNumeroDeAssentos());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterarAeronave(Aeronave aeronave) {
		
		String sql = "UPDATE aeronave set nomeEmpresa = ?"
				+ "tipoAeronave = ?"
				+ "nomeroDeAssentos = ?"
				+ "where idAeronave = ?";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, aeronave.getNomeEmpresa());
			ps.setString(2, aeronave.getTipoAeronave());
			ps.setInt(3, aeronave.getNumeroDeAssentos());
			ps.setInt(4, aeronave.getIdAeroporto());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	
	}

	@Override
	public void deletarAeronave(Aeronave aeronave) {
		String sql = "DELETE FROM Aeronave where idAeronave = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setInt(1, aeronave.getIdAeroporto());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Aeronave listarPorId(int aeronave) {
		Aeronave aeroID = new Aeronave();
		
		String sql = "SELECT * FROM Aeronave "
				+ "Where idAeronave = ? ;";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setInt(1, aeronave);
			
			ResultSet rs = ps.executeQuery(); 
		
			while(rs.next()) {
				
				aeroID.setNomeEmpresa(rs.getString("nomeEmpresa"));
				aeroID.setNumeroDeAssentos(rs.getInt("numeroDeAssentos"));
				aeroID.setTipoAeronave(rs.getString("tipoAeronave"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aeroID;
	}

	@Override
	public List<Aeronave> ListarTodasAeronave() {
		List<Aeronave> lista = new ArrayList<Aeronave>();
		
		String sql = "SELECT * FROM Passageiro";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(); 
			
			while(rs.next()) {
				Aeronave a = new Aeronave();
				
				a.setIdAeroporto(rs.getInt("idAeroporto"));
				a.setNomeEmpresa(rs.getString("nomeEmpresa"));
				a.setNumeroDeAssentos(rs.getInt("numeroDeAssentos"));
				a.setTipoAeronave(rs.getString("tipoAeronave"));
				
				
				lista.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public List<Aeronave> ListarEmpresaPorNome(String nome) {
		List<Aeronave> listaNome = new ArrayList<Aeronave>();
		
		String sql = "SELECT * FROM Aeronave"
				+ " where nomeEmpresa = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, nome);
			
			ResultSet rs = ps.executeQuery(); 
			
			while(rs.next()) {
				Aeronave a = new Aeronave();
				
				a.setNomeEmpresa(rs.getString("nomeEmpresa"));
				a.setIdAeroporto(rs.getInt("idAeroporto"));
				a.setNumeroDeAssentos(rs.getInt("numeroDeAssentos"));
				a.setTipoAeronave(rs.getString("TipoAeronave"));
				
				listaNome.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaNome;
	}
	
	

}
