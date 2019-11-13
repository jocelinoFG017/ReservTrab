package br.edu.iffar.reserv.visao.web;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.edu.iffar.reserv.controle.ItemLogic;
import br.edu.iffar.reserv.modelo.Item;

/**
 * <p>
 * Controlador padrão para um item do quarto
 * </p>
 * 
 * @author fernando
 * @since 08/10
 */
@Controller
public class ItemController {
	@Inject
	private Result result;
	//@Inject
	private ItemLogic logic;

	
	public ItemController() {
		this.logic = new ItemLogic();
	}
	
	public void editar(long id) {
		Item item = (Item) logic.buscaPorID(id);
		result.include("entidade", item);
	}

	public void listar() {
		result.include("itemList", logic.buscaTodos(null));
	}

	public void gravar(Item item) {
		logic.gravar(item);
		result.include("gravado", true);
		result.forwardTo(this).editar(item.getID());
	}
}
