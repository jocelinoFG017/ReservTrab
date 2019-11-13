package br.edu.iffar.reserv.visao.web;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

/**
 * <p>
 * Controlador padrão para requisições inicias
 * </p>
 * 
 * @author Professor
 * @since Oct 1, 2019 9:42:14 PM
 */
@Controller
public class IndexController {
	@Inject
	private Result result;
	
	public void hello() {
		String mensagem = "hello world!";
		System.out.println(mensagem);
		
		result.include("msg", mensagem);
	}
}
