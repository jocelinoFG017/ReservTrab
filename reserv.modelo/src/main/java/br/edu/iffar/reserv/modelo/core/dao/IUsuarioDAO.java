package br.edu.iffar.reserv.modelo.core.dao;

import br.edu.iffar.reserv.modelo.Usuario;

/**
 * <p>
 * Especifica os comportamentos exclusivos de um usuario
 * </p>
 * 
 * @author Professor
 * @since Sep 3, 2019 10:18:14 PM
 */
public interface IUsuarioDAO extends IDAO {
	/**
	 * <p>
	 * Busca o usuario pelo endereco de email, deve retornar apenas o usuário que
	 * corresponde ao endereço informado
	 * </p>
	 */
	public Usuario buscaPorEmail(String email) throws DAOException;

	/**
	 * <p>
	 * Busca o usuario pelo endereco de email, deve retornar apenas o usuário que
	 * corresponde ao endereço informado e uma senha especifica
	 * </p>
	 */
	public Usuario buscaPorEmailSenha(String email, String senha) throws DAOException;

}
