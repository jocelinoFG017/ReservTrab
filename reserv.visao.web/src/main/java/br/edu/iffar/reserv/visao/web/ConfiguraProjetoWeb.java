package br.edu.iffar.reserv.visao.web;

import javax.enterprise.event.Observes;

import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.edu.iffar.reserv.dao.mysql.MysqliDAO;
import br.edu.iffar.reserv.modelo.core.dao.FabricaDAO;

/*
 * <p>
 * Definir as confgi's necessarias/perninentes a um project web java.
 * tais config's ocorrem uma unica vez ao inicializar a aplicacao.
* </p>
* @author JoGar|017
* @since 22 de out de 2019 21:15:49
* 
*/
public class ConfiguraProjetoWeb {
	public void inicializa(@Observes VRaptorInitialized init) {
		System.out.println("Inicializando app web");
		// define o modelo de persistencia
		FabricaDAO.defineModelo(new MysqliDAO());
		System.out.println("Persistence Model defined!");
	}
}
