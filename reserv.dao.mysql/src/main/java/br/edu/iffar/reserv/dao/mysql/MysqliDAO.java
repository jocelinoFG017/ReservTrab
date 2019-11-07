package br.edu.iffar.reserv.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.edu.iffar.reserv.modelo.Item;
import br.edu.iffar.reserv.modelo.core.IEntidade;
import br.edu.iffar.reserv.modelo.core.dao.DAOException;
import br.edu.iffar.reserv.modelo.core.dao.IDAO;

/*
 * <p>
 * Implementacao do padrao DAO with the Mysql
* </p>
* @author JoGar|017
* @since 4 of nov of 2019 21:12:38
* 
*/

@SuppressWarnings("all")
public class MysqliDAO implements IDAO {
	private Connection conexao;
	private Connection con;
	
// 	reference to class entidade
	private Class<? extends IEntidade> classeEntidade;
	
	public MysqliDAO() {
		// call the constructor que receive with parameter
		// a class of entidade
		this(null);
	}

	public MysqliDAO(Class<? extends IEntidade> entidade) {
		this.classeEntidade = entidade;
	}

	public void gravar(IEntidade entidade) throws DAOException { // em teoria eh pra ta funcional
		try {
			Item item = (Item) entidade;
			
			// create the command SQL to insert a item
			String query = "insert into item values";
			query += "(?, ?)";
			// cria um objeto de transporte para o comando sql
			
			PreparedStatement smt =	con.prepareStatement(query);
			smt.setLong(1, item.getID());
			smt.setString(2, item.getDescricao());
			
			// send the sql para to banco de dados
			smt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// DELETA a'1' item
	public void excluir(IEntidade entidade) throws DAOException {
		
		String deleteStr = "DELETE from item " + "WHERE idItem = ? and descricao = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(deleteStr);
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public IEntidade buscaPorChave(long chave) throws DAOException {
		return null;
	}

	public List<IEntidade> getList(String ordem) throws DAOException {// em teoria eh pra ta funcional
		try {
			Statement smt = conexao.createStatement(); // cria o statement smt 
			
			ResultSet rs = smt.executeQuery("select * from item"); // execute the select
			
			// percorre all as tuplas contidas na table
			while(rs.next()) {
				System.out.println(rs.getString("descricao"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public <Futuro extends IDAO> Futuro criaNovoDAO(Class<? extends IEntidade> classeEntidade) throws DAOException {
		// monta o pacote da class a ser instanciada
		StringBuffer pacote = new StringBuffer();
		pacote.append("br.edu.iffar.reserv.dao.mysql.");
		pacote.append( classeEntidade.getSimpleName() );
		pacote.append("DAO");
		try {
			Class classeDAO = Class.forName(pacote.toString());
			return (Futuro) classeDAO.newInstance();
		}catch( Exception ex ) {
			throw new DAOException(ex.getMessage());
		}
	}
	
	public void conectarBancoDados() throws Exception {
		// load the class of jar of conexao
		// o jar deve estar no class path
		Class.forName("com.mysql.cj.jdbc.Driver");
		// define a url de conexao
		String url = "jdbc:mysql://localhost/java";
		
		// open the conexao
		this.con = DriverManager.getConnection(url, "root", "");

	}

}
