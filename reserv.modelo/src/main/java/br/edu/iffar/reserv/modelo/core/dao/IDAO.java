package br.edu.iffar.reserv.modelo.core.dao;

import java.util.List;

import br.edu.iffar.reserv.modelo.core.IEntidade;

/**
 * <p>
 * Interface com as ações comuns de persistencia
 * </p>
 * 
 * @author Professor
 * @since Sep 3, 2019 10:03:23 PM
 */
public interface IDAO {
	/**
	 * <p>
	 * Grava ou atualiza uma entidade
	 * </p>
	 */
	public void gravar(IEntidade entidade) throws DAOException;

	/**
	 * <p>
	 * Exclui uma entidade
	 * </p>
	 */
	public void excluir(IEntidade entidade) throws DAOException;

	/**
	 * <p>
	 * Busca uma entidade pelo campo chave
	 * </p>
	 */
	public IEntidade buscaPorChave(long chave) throws DAOException;

	/**
	 * <p>
	 * Busca todos os registros de dada tabela, possibilitando a ordenacao por uma
	 * coluna especifica
	 * </p>
	 */
	public List<IEntidade> getList(String ordem) throws DAOException;

	/**
	 * <p>
	 * Cria uma classe concreta que implementa os compostamentos esopecificos e
	 * genéricos do padrão DAO, ou seja, se informarmos uma classe do tipo Quarto,
	 * este método deve criar uma classe QuartoDAO.
	 * </p>
	 */
	public <Futuro extends IDAO> Futuro criaNovoDAO(Class<? extends IEntidade> classeEntidade) throws DAOException;

}
