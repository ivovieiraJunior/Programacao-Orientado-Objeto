package Repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Aeroporto;
import util.JdbcDBUtil;

public class AeroportoMySLQRepositorio implements IAeroportoRepositorio {

	private PreparedStatement ps;
	@Override
	public void cadastrarAeroporto(Aeroporto aeroporto) {
		

	}

	@Override
	public void alterarAeroporto(Aeroporto passageiro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarAeroporto(Aeroporto passageiro) {
		// TODO Auto-generated method stub

	}

	@Override
	public Aeroporto listarPorId(int passageiro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aeroporto> ListarTodosAeroportos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aeroporto> ListarAeroportoPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Aeroporto> MostarTodosPorEstado(String nome){
		List<Aeroporto> lista = new ArrayList<Aeroporto>();	
		
		String sql = "SELECT * FROM Aeroporto "
				+ "where estadoAeroporto = ? ";
		
		try {
		
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, nome);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Aeroporto a = new Aeroporto();
				
				a.setNomeAeroporto(rs.getString("nomeAeroporto"));
				a.setCidadeAeroporto(rs.getString("cidadeAeroporto"));
				a.setIdAeroporto(rs.getInt("idAeroporto"));
				a.setEstadoAeroporto(rs.getString("estadoAeroporto"));
				
				lista.add(a);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Aeroporto> ListarPorCidade(String cidade){
		List<Aeroporto> lista = new ArrayList<Aeroporto>();
		
		String sql = "SELECT * from Aeroporto "
				+ "where cidadeAeroporto = ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, cidade);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Aeroporto a = new Aeroporto(); 
				
				a.setIdAeroporto(rs.getInt("idAeroporto"));
				a.setCidadeAeroporto(rs.getString("cidadeAeroporto"));
				a.setEstadoAeroporto(rs.getString("estadoAeroporto"));
				a.setNomeAeroporto(rs.getString("nomeAeroporto"));
				
				lista.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return lista;
	} 

}







