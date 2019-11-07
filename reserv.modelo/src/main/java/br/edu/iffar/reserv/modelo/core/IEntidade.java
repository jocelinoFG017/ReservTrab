package br.edu.iffar.reserv.modelo.core;
/**
 * <p>
 * Interface utilizada para agrupar 
 * as entidades do sistema. Promovendo meios comuns
 * para interagir com os campos chave primária
* </p>
* @author Professor
* @since Sep 3, 2019 9:19:54 PM
*/
public interface IEntidade {
	/**
	 * <p>
	 * Retorna a chave primaria
	 * </p>
	 */
	public long getID();
	/**
	 * <p>
	 * Altera a chave primária
	 * </p>
	 */
	public void setID(long chave);
}
