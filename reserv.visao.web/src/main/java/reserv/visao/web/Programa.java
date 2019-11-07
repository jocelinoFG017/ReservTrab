package reserv.visao.web;

import br.edu.iffar.reserv.controle.ClienteLogic;
import br.edu.iffar.reserv.controle.ItemLogic;
import br.edu.iffar.reserv.dao.hibernate.HibernateDAO;
import br.edu.iffar.reserv.modelo.Cliente;
import br.edu.iffar.reserv.modelo.Item;
import br.edu.iffar.reserv.modelo.core.dao.FabricaDAO;

// classe para testa a estrutura
public class Programa {

	public static void main(String[] args) {
		// definir o modelo 
		FabricaDAO.defineModelo( new HibernateDAO( )  );
		
		
		Item item = new Item();
		item.setDescricao("cama");
		item.setID(1);
		
		
		ItemLogic logica = new ItemLogic();
		logica.gravar(item);
	
		Cliente c = new Cliente();
		c.setEndereco("R. otaviano Mendes, 355");
		c.setNome("Bastiao");
		c.setEmail("bastiao@aluno.iffar.edu.br");
		c.setSenha("123");
		
		ClienteLogic cl = new ClienteLogic();
		cl.gravar(c);
		
		
	}
	
}
