package br.edu.iffar.reserv.modelo.core.dao;
/**
 * <p>
 * Excecao que pode eventualmente ocorrer em tempo de execução
 * referente a processos de persistência
* </p>
* @author Professor
* @since Sep 3, 2019 10:08:24 PM
*/
public class DAOException extends RuntimeException{

	public DAOException( String erro ) {
		super(erro);
	}
	
}
