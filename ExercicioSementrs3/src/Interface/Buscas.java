package Interface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Aluno;
import model.Livro;
import util.JdbcDBUtil;

public class Buscas {
	
	private PreparedStatement ps;
	
	//=== Exercicio 07 aluno === 
	public void CadastarAluno(Aluno aluno) {
		
		String sql = "Insert Into Aluno (nome,email,fone,dataValidadeCarteira)"
				+ "values(?,?,?,?)";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getEmail());
			ps.setString(3, aluno.getFone());
			ps.setString(4, aluno.getDataValidadeCarteira());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//=== Exercicio 07 Livro === 	
	public void CadastarLivro(Livro livro) {
		String sql = "Insert Into Livro (titulo,autor,editora,anoLancamento,categoria,disponivel)"
				+ "values(?,?,?,?,?,?)";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, livro.getTitulo());
			ps.setString(2, livro.getAutor());
			ps.setString(3, livro.getEditora());
			ps.setInt(4, livro.getAnoLancamento());
			ps.setString(5, livro.getCategoria());
			ps.setInt(6, livro.getDisponivel());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//=== Exercicio 02 ===
	public List<Livro> ConsultarLivroTitulo(String titulo) {
		List<Livro> lista = new ArrayList<Livro>();
		String sql = "Select * from livro where titulo like ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, "%" + titulo + "%");
			ResultSet rs =	ps.executeQuery();
			
			while(rs.next()) {
				Livro livro = new Livro();
				
				livro.setTitulo(rs.getString("titulo"));
				lista.add(livro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	//=== Exercicio 04 ===
	public List<String> ConsultarEmprestimos(String titulo) {
		List<String> lista = new ArrayList<String>();
		String sql = "Select li.titulo as Titulo, al.nome as Aluno,em.dataRetirada as Retirada "
				+ "from emprestimo em inner join Livro li "
				+ "on (em.id_livro = li.id_livro) inner join Aluno al "
				+ "on (em.id_aluno = al.id_aluno) ";
				//+ "where titulo like ? ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			//ps.setString(1, "%" + titulo + "%");
			ResultSet rs =	ps.executeQuery();
			
			while(rs.next()) {
				lista.add("Titulo: " + rs.getString("Titulo") 
				+"\n Aluno: " + rs.getString("Aluno")
				+"\n data Retirada: " + rs.getDate("Retirada"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	//=== Exercicio 03 ===
	public List<String> ConsultarLivroQuantidade() {
		
		List<String> lista = new ArrayList<String>();
		String sql = "Select count(id_livro) as Total, categoria from livro group by categoria";

		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ResultSet rs =	ps.executeQuery();
			while(rs.next()) {
				lista.add(rs.getString("Categoria")+ ":" + rs.getInt("Total"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	//=== Exercicio 05 ===
	public List<String> ConsultarMultas() {
		List<String> lista = new ArrayList<String>();
		String sql = "Select al.nome as Aluno,Sum(em.multa) as MultaTotal "
				+ "from emprestimo em inner join Aluno al "
				+ "on (em.id_aluno = al.id_aluno) "
				+ "group by Aluno ";
		
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ResultSet rs =	ps.executeQuery();
			
			while(rs.next()) {
				lista.add("Aluno: " + rs.getString("Aluno")
				+" Multa Total: " + rs.getDouble("MultaTotal"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	//=== Exercicio 06 ===
	public void AtualizarCarteira(Aluno aluno) {
		String sql = "UPDATE Aluno "
				+ "set dataValidadeCarteira = ? "
				+ "where id_aluno = ? ";
				
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setString(1, aluno.getDataValidadeCarteira());
			ps.setInt(2, aluno.getId_Aluno());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//=== Exercicio 08 ===
	public List<String> setEmprestimo(Aluno aluno, Livro livro) {
		List<String> lista = new ArrayList<String>();
		String sql = "INSERT INTO Emprestimo (id_aluno,id_livro,dataRetirada)"
				+ "Values(?,?,?); "
				+ "UPDATE livro "
				+ "SET disponivel = 0 "
				+ "where id_livro = ? ";
		Date data = new Date(); 
		try {
			ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
			ps.setInt(1, aluno.getId_Aluno());
			ps.setInt(2, livro.getId_livro());
			ps.setInt(3, data.getDate());
			ps.setInt(4, livro.getId_livro());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	//=== Exercicio 09 ===
		public List<String> setEmprestimoDevolver(Aluno aluno, Livro livro) {
			List<String> lista = new ArrayList<String>();
			String sql = "UPDATE EMPRESTISMO"
					+ "SET dataDevolução = ? "
					+ "where id_aluno = ? "
					+ "and id_livro = ? ;" 
					+ "UPDATE livro "
					+ "SET disponivel = 1 "
					+ "where id_livro = ? ";
			Date data = new Date(); 
			try {
				ps = JdbcDBUtil.getConnetion().prepareStatement(sql);
				ps.setInt(1, data.getDate());
				ps.setInt(2, aluno.getId_Aluno());
				ps.setInt(3, livro.getId_livro());
				
				ps.setInt(4, livro.getId_livro());
				ps.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
}







