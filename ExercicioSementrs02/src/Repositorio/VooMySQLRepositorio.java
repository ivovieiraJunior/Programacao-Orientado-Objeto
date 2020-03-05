package Repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Voo;
import util.JdbcDBUtil;

public class VooMySQLRepositorio implements IVoo {

	private PreparedStatement ps;
	
	@Override
	public void cadastrarVoo(Voo voo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterarVoo(Voo voo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarVoo(Voo voo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Voo listarPorId(int voo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voo> ListarTodosVoos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Voo> ListarPelaDataChegada(String data){
		
		List<Voo> lista = new ArrayList<Voo>();
		
		String sql = "SELECT * FROM VOO	"
				+ "WHERE dataChegada = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, data);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Voo v = new Voo();
				v.setIdAeroportoChegada(rs.getInt("idAeroportoChegada"));
				v.setAeronave(rs.getString("aeronave"));
				v.setIdAeroportoOrigem(rs.getInt("idAeroportoOrigem"));
				v.setNumeroVoo(rs.getInt("numeroVoo"));
				v.setDataSaida(rs.getDate("dataSaida"));
				v.setDataChegada(rs.getDate("dataChegada"));
				
				lista.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public List<Voo> ListarPelaDataSaida(String data){
		
		List<Voo> lista = new ArrayList<Voo>();
		
		String sql = "SELECT * FROM VOO	"
				+ "WHERE dataSaida = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, data);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Voo v = new Voo();
				v.setIdAeroportoChegada(rs.getInt("idAeroportoChegada"));
				v.setAeronave(rs.getString("aeronave"));
				v.setIdAeroportoOrigem(rs.getInt("idAeroportoOrigem"));
				v.setNumeroVoo(rs.getInt("numeroVoo"));
				v.setDataSaida(rs.getDate("dataSaida"));
				v.setDataChegada(rs.getDate("dataChegada"));
				
				lista.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public List<Voo> ListarPelaEmpresa(String data, String Empresa){
		
		List<Voo> lista = new ArrayList<Voo>();
		
		String sql = "SELECT *Voo FROM VOO as vo inner join Aeronave as Ae"
				+ "on(vo.idAeroportoOrigem = Ae.idAeroporto)"
				+ "WHERE vo.dataSaida = ? "
				+ "and Ae.nomeEmpresa = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, data);
			ps.setString(2, Empresa);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Voo v = new Voo();
				v.setIdAeroportoChegada(rs.getInt("idAeroportoChegada"));
				v.setAeronave(rs.getString("aeronave"));
				v.setIdAeroportoOrigem(rs.getInt("idAeroportoOrigem"));
				v.setNumeroVoo(rs.getInt("numeroVoo"));
				v.setDataSaida(rs.getDate("dataSaida"));
				v.setDataChegada(rs.getDate("dataChegada"));
				
				lista.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public List<Voo> ListarPelaEmpresaEntrada(String data, String Empresa){
		
		List<Voo> lista = new ArrayList<Voo>();
		
		String sql = "SELECT *Voo FROM VOO as vo inner join Aeronave as Ae"
				+ "on(vo.idAeroportoOrigem = Ae.idAeroporto)"
				+ "WHERE vo.dataChegada = ? "
				+ "and Ae.nomeEmpresa = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, data);
			ps.setString(2, Empresa);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Voo v = new Voo();
				v.setIdAeroportoChegada(rs.getInt("idAeroportoChegada"));
				v.setAeronave(rs.getString("aeronave"));
				v.setIdAeroportoOrigem(rs.getInt("idAeroportoOrigem"));
				v.setNumeroVoo(rs.getInt("numeroVoo"));
				v.setDataSaida(rs.getDate("dataSaida"));
				v.setDataChegada(rs.getDate("dataChegada"));
				
				lista.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public List<Voo> ListarPelaAeroporto(String Empresa){
		
		List<Voo> lista = new ArrayList<Voo>();
		
		String sql = "SELECT *Voo FROM VOO as vo inner join Aeroporto as Ae"
				+ "on(vo.idAeroportoOrigem = Ae.idAeroporto)"
				+ "WHERE Ae.nomeAeroporto = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(2, Empresa);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Voo v = new Voo();
				v.setIdAeroportoChegada(rs.getInt("idAeroportoChegada"));
				v.setAeronave(rs.getString("aeronave"));
				v.setIdAeroportoOrigem(rs.getInt("idAeroportoOrigem"));
				v.setNumeroVoo(rs.getInt("numeroVoo"));
				v.setDataSaida(rs.getDate("dataSaida"));
				v.setDataChegada(rs.getDate("dataChegada"));
				
				lista.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
}
