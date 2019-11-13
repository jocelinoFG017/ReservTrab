package reserv.visao.web;

import br.edu.iffar.reserv.controle.ItemLogic;
import br.edu.iffar.reserv.dao.mysql.MysqliDAO;
import br.edu.iffar.reserv.modelo.Item;
import br.edu.iffar.reserv.modelo.core.dao.FabricaDAO;

// classe para testa a estrutura
public class Programa {

	public static void main(String[] args) {
		// definir o modelo 
		FabricaDAO.defineModelo( new MysqliDAO( ) );
		
		Item item = new Item();
		item.setDescricao("cama");
		item.setID(1);
		
		ItemLogic logica = new ItemLogic();
		logica.gravar(item);
	
		
		
	}
	
}
