package br.edu.iffar.reserv.visao.web;

import javax.enterprise.event.Observes;

import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.edu.iffar.reserv.dao.mysql.MysqliDAO;
import br.edu.iffar.reserv.modelo.core.dao.FabricaDAO;

/**
 * <p>
 * Definir as  configuracoes necessarias ou pertinentes a 
 * um projeto Java web.
 * Essas configuracoes ocorrem uma unica vez ao inicializar a 
 * aplicacao
 * </p>
 * @author fernando
 *
 */
public class ConfiguraProjetoWeb {

	public void inicializa(@Observes VRaptorInitialized init) {
		System.out.println("Inicializando app web!");
		// define o modelo de persistencia
		FabricaDAO.defineModelo(new MysqliDAO());
		System.out.println("Modelo de persistencia defindido!");
	}
	
}
