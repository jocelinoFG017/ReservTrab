package br.edu.iffar.reserv.controle;

import java.util.List;

import br.edu.iffar.reserv.modelo.Cliente;
import br.edu.iffar.reserv.modelo.core.IEntidade;
import br.edu.iffar.reserv.modelo.core.dao.FabricaDAO;
import br.edu.iffar.reserv.modelo.core.dao.IDAO;

/**
 * <p>
 * Classe abastrata que concentra todas as acoes que são comuns as entidades
 * </p>
 * 
 * @author Professor
 * @since Sep 3, 2019 9:12:29 PM
 */
public abstract class ALogic {
	IDAO dao;

	/**
	 * <p>
	 * Cria uma nova instancia de lógica a partir de uma entidade específica.
	 * </p>
	 */
	public ALogic(Class<? extends IEntidade> classeEntidade) {
		this.dao =
		FabricaDAO.getModelo().criaNovoDAO(classeEntidade);
	}

	/**
	 * <p>
	 * Grava uma nova entidade ou atualiza caso já exista
	 * </p>
	 * 
	 * @param entidade
	 *            entidade a ser gravado ou atualizado
	 */
	public void gravar(IEntidade entidade) {
		this.dao.gravar(entidade);
	}

	/**
	 * <p>
	 * Remove uma entidade do sistema
	 * </p>
	 * 
	 * @param entidade
	 *            entidade a ser removido
	 */
	public void excluir(IEntidade entidade) {
		this.dao.excluir(entidade);
	}

	/**
	 * <p>
	 * Busca uma entidade pelo campo chave primaria
	 * </p>
	 */
	public IEntidade buscaPorID(long id) {
		return this.dao.buscaPorChave(id);
	}

	/**
	 * <p>
	 * Traz todos os registros de uma determinada entidade, possibilitando a
	 * ordenação (ascendente) por um campo específico
	 * </p>
	 */
	public List<IEntidade> buscaTodos(String campoOrdem) {
		return this.dao.getList(campoOrdem);
	}

}
