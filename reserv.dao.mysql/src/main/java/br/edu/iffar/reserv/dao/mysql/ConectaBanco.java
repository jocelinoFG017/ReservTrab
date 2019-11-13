package br.edu.iffar.reserv.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
 * <p>
 * Classe que realiza a conexao com o banco
* </p>
* @author JoGar|017
* @since 7 de nov de 2019 18:33:18
* 
*/
@SuppressWarnings("all")
public class ConectaBanco {// esse funciona
	public static void main(String[] args) throws Exception  {
		// carrega a classe do jar de conexao
		// o jar deve estar no class path
		Class.forName("org.postgresql.Driver");
		// define a url de conexao
		String url = "jdbc:postgresql://localhost/reserv";
		url += "?useTimezone=true&serverTimezone=America/Sao_Paulo";
		
		//abre a conexao
		Connection con = DriverManager.getConnection(url, "postgres", "postgres");
		
		// cria o comando SQL para inserir um item
		String query = "insert into item values";
		query +="('2', 'sofa')";
		// cria um objeto de transporte para o comando sql
		Statement smt = con.createStatement();
		// envia a sql para o banco de dados
		smt.executeUpdate(query);
		// finaliza a conexao
		smt.close();
		con.close();
	}
}
