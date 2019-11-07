package br.edu.iffar.reserv.dao.mysql;

import br.edu.iffar.reserv.modelo.Item;
import br.edu.iffar.reserv.modelo.core.dao.IItemDAO;
/*
 * <p>
 * Implementacao concreta dos comportamentos 
 * personalizados de persistencia para
 * a entidade Item
* </p>
* @author JoGar|017
* @since 4 de nov de 2019 21:15:54
* 
*/
public class ItemDAO extends MysqliDAO implements IItemDAO{
	public ItemDAO() {
		super(Item.class);
	}
}
